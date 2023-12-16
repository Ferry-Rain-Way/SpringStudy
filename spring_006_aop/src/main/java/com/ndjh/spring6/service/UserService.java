package com.ndjh.spring6.service;


//Target目标对象,待增强
public class UserService {
    public void  login(){
        System.out.println("系统正在进行身份验证");
//        throw  new RuntimeException();
    }
}
