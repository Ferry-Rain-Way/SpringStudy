package com.nfjh.aop.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 切面:切点 + 通知
 */
//纳入Spring管理
@Component("loginAspect")
//切面注解
@Aspect
public class LoginAspect {

    //增强代码
    @Before("execution(public void com.nfjh.aop.service..*())")
    public void checkLogin(){
        System.out.println("check student number before student login !!");
    }


    //其他增强代码
    //....
}

