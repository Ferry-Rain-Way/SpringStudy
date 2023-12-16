package com.ndjh.spring6.service;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;

@Aspect
@Order(2)
public class SafetyAspect {
    //跨类使用要写全限定类名+方法名()
    @Before("com.ndjh.spring6.service.LogAspect.generalExpression()")
    public void safetyBefore(){
        System.out.println("安全前置通知");
    }
}
