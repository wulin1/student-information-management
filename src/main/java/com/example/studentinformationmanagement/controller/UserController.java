package com.example.studentinformationmanagement.controller;

import com.example.studentinformationmanagement.model.Spec;
import com.example.studentinformationmanagement.model.UserPO;
import com.example.studentinformationmanagement.service.impl.UserServiceImpl;
import com.example.studentinformationmanagement.util.MD5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    public UserServiceImpl userService;


    /**
     * @Description:进入登陆页面

     */
    @GetMapping
    public String loginIndex(){
        return  "login";
    }

    /**
     * @Description:用户登陆
     */
    @RequestMapping("/login")
    public String login(@RequestParam String name,
                        @RequestParam  String password,
                        HttpSession session,
                        RedirectAttributes attributes, Model model){
        // 判断用户名是否为空
        boolean checkName=(null==name||"".equals(name));
        // 判断密码是否为空
        boolean checkPassord=(null==password||"".equals(password));
        if(checkName||checkPassord){
            // attributes.addFlashAttribute("nullNameAndPassword","用户名或密码不能为空");
            model.addAttribute("msg", "用户名或密码不能为空");
            return "login";
        }
        //MD5急加密
        String passwordMd5 = MD5.MD5(password);
        System.out.println(passwordMd5);
        // 在数据库中查找
        UserPO user=userService.getUser(name,passwordMd5);
        if(null==user){
            attributes.addFlashAttribute("message","用户名或者密码错误");
            return "login";
        }
        session.setAttribute("user",user);
        return "index";
    }


    /**
     * @Description:进入注册页面
     */
    @RequestMapping("/toRegist")
    public String insert() {
        return "register";

    }

    /**
     * @Description:用户注册信息
     */
    @RequestMapping("/regist")
    public String save(UserPO userPO,RedirectAttributes attributes) {
        // 获取用户名
        String name=userPO.getName();
        UserPO user=userService.getName(name);
        if(null!=user){
            attributes.addFlashAttribute("mess","用户名已被注册");
            return  "register";
        }
        String passwordMd5 = MD5.MD5(userPO.getPassword());
        userPO.setPassword(passwordMd5);
        userService.save(userPO);
        return "login";
    }

    /**
     * 专业管理界面查询
     * @return
     */
    @RequestMapping("specialty")
    public String conspecialty(HttpServletRequest request) {
        List list=userService.findSpecialty();
        request.setAttribute("list",list);
        return "specialty";
    }
    /**
     * 专业管理界面查询
     * @return
     */
    @RequestMapping("inSpec")
    public String inSpec(Spec Spec,HttpServletRequest request) {
        userService.inSpec(Spec);
        List list=userService.findSpecialty();
        request.setAttribute("list",list);
        return "specialty";
    }
    /**
     * 专业管理界面查询
     * @return
     */

}
