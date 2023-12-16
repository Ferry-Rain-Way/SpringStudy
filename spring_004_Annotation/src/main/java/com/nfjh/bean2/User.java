package com.nfjh.bean2;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("userAnnotation")
public class User {
//    @Value("张三")
    private String username;
//    @Value("123456")
    private  String passwd;
//    @Value("21")
    private int age;


    public User(@Value("李四") String username,  @Value("3012") String passwd, @Value("23") int age) {
        this.username = username;
        this.passwd = passwd;
        this.age = age;
    }


    //    @Value("张三")
//    public void setUsername(String username) {
//        this.username = username;
//    }
//    @Value("123456")
//    public void setPasswd(String passwd) {
//        this.passwd = passwd;
//    }
//    @Value("23")
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public String getPasswd() {
//        return passwd;
//    }
//
//    public int getAge() {
//        return age;
//    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", passwd='" + passwd + '\'' +
                ", age=" + age +
                '}';
    }




}
