package com.example.studentinformationmanagement.model;

/**
 * @Author:吴宸煊
 * @Date: Created in 13:40 2018/1/17
 * @Description:操作数据库用户实体类
 */
public class UserPO {

    /*
 id编号
  */
    private Integer id;
    /*
    姓名
     */
    private String name;
    /*
    密码
     */
    private String password;
    /*
    性别
     */
    private String sex;
    /*
    年龄
     */
    private Integer age;



    public String getAmerican_politics() {
        return name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "UserPO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                '}';
    }
}
