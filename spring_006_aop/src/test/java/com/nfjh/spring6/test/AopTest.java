package com.nfjh.spring6.test;

import com.ndjh.spring6.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopTest {

    @Test
    public void testBeforeAspect(){
        ApplicationContext  applicationContext = new ClassPathXmlApplicationContext("aop-test.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.login();

    }
}
