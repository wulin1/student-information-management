package com.example.studentinformationmanagement.service.impl;
import com.example.studentinformationmanagement.mapper.UserMapping;
import com.example.studentinformationmanagement.model.Spec;
import com.example.studentinformationmanagement.model.UserPO;
import com.example.studentinformationmanagement.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @author scw
 * @create 2018-01-03 10:40
 * @desc 进行对person实体操作的service，这里就不写接口了，但是实际开发中，应该要面向接口编程
 **/
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    public UserMapping userMapping ;


    /**
     * @Description:用户注册
     * */
    public void save(UserPO userPO) {
        userMapping.save(userPO);
    }

    @Override
    public UserPO getUser(String name, String passwordMd5) {
        return userMapping.getUser(name,passwordMd5);
    }

    @Override
    public UserPO getName(String name) {
        return userMapping.getName(name);
    }

    @Override
    public List<Spec> findSpecialty() {
        return userMapping.findSpecialty();
    }

    @Override
    public void inSpec(Spec spec) {
        userMapping.inSpec(spec);
    }


    private static final long serialVersionUID = 5417488369543075097L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String message = "{\"message\":\"登录成功\"}";
        response.setContentType("application/json;charset=utf-8");
        if("123".equals(username) && "666".equals(password)) {
            response.getWriter().write(message);
        }
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }



}
