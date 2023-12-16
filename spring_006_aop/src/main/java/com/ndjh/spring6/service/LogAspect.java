package com.ndjh.spring6.service;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

//@Aspect注解给spring检查
@Aspect
@Order
public class LogAspect {
    //通知+切点
    /*
    通知就是增强代码
     */

    @Pointcut("execution(* com.ndjh.spring6.service..*(..))")
    public void generalExpression(){}

    //括号里是切点表达式
    //execution([访问控制权限修饰符] 返回值类型 [全限定类名]方法名(形式参数列表) [异常])
    //注意在全限定类名与方法名之间没有空格

    //Before注解标注的是前置通知
    @Before("generalExpression()")
    public void testBefore(){
        System.out.println("前置通知");
    }

    @AfterReturning("generalExpression()")
    public void testAfterReturning(){
        System.out.println("后置通知");
    }

    //注意环绕通知方法有参数,且有调用方法
    //调用的方法会抛出异常
    //如果不写参数的会话,可能不会抛出异常,但会影响到其他通知的执行
    @Around("generalExpression()")
    public void testAround(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("前环绕通知");
        joinPoint.proceed();
        System.out.println("后环绕通知");
    }


    //若异常环绕通知执行,则后环绕通知不会执行,而最终环绕通知执行
    @AfterThrowing("execution(* com.ndjh.spring6.service..*(..))")
    public void testAfterThrowing(){
        System.out.println("异常通知");
    }

    @After("execution(* com.ndjh.spring6.service..*(..))")
    public void testAfter(){
        System.out.println("最终通知");
    }

}

