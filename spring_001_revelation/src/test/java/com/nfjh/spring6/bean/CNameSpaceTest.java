package com.nfjh.spring6.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CNameSpaceTest {
    @Test
    public void test_c_namespace3(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("c-namespace.xml");
        Con2 con2 = applicationContext.getBean("conBean2", Con2.class);
        System.out.println(con2);

    }


    @Test
    public void test_c_namespace(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("c-namespace.xml");
        Con con = applicationContext.getBean("conBean",Con.class);
        System.out.println(con);
    }




    @Test
    public void test_c_namespace2(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("c-namespace.xml");
        Shop shopBean = applicationContext.getBean("shopBean", Shop.class);
        System.out.println(shopBean);
        //Shop{address='天津市', name='小张水果', businessHours=Fri Oct 28 06:35:03 CST 2022}
    }




}
