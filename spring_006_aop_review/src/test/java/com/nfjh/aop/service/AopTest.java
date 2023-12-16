package com.nfjh.aop.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {
    @Test
    public void testBefore(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-aspect-aop.xml");
        StudentService studentService = applicationContext.getBean("studentService", StudentService.class);
        studentService.login();
    }
}
