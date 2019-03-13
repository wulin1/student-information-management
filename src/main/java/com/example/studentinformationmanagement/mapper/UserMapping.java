package com.example.studentinformationmanagement.mapper;

import com.example.studentinformationmanagement.model.Spec;
import com.example.studentinformationmanagement.model.UserPO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * function : 针对Person实体进行的crud操作
 */
@Mapper
@Repository
public interface UserMapping {

    /**
     * @Description:用户注册
     * @param: userPO
     * @return:
     */
    void save(UserPO userPO);
    /**
     * @Description:用户登陆
     * @param:name
     * @param:password
     * @return:UserPO
     */
    UserPO getUser(@Param(value = "name") String name, @Param(value = "passwordMd5") String passwordMd5);
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
    /**
     * @Description:t添加专业
     * @param: userPO
     * @return:
     */
    void inSpec(Spec spec);
}
