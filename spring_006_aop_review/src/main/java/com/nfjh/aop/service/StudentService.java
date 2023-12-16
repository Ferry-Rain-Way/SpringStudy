package com.nfjh.aop.service;

import org.springframework.stereotype.Service;

/**
 * StudentService 是目标对象
 * 即:待增强的对象
 */

//纳入spring管理
@Service("studentService")
public class StudentService {

    //目标方法:切点方法
    public void login (){
        System.out.println("student login !!");
    }

}
