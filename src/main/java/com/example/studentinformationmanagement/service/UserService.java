package com.example.studentinformationmanagement.service;


import com.example.studentinformationmanagement.model.Spec;
import com.example.studentinformationmanagement.model.UserPO;

import java.util.List;

public interface UserService {


    /**
     * @Description:用户注册
     * @param: userPO
     * @return:
     */
    void save(UserPO userPO);
    /**
     * @Description:用户登陆
     * @param: name
     * @param:password
     * @return:UserPO
     */
    UserPO getUser(String name, String passwordMd5);
    /**
     * @Description:通过用户名进行查找
     * @param: name
     * @return:UserPO
     */
    UserPO getName(String name);

    /**
     * 专业管理查询
     * @param
     */
     List<Spec> findSpecialty();
    void inSpec(Spec spec);
}
