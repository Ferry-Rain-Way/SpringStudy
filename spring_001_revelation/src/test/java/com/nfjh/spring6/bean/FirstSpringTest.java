package com.nfjh.spring6.bean;
import com.nfjh.spring6.dao.UserDao;
import com.nfjh.spring6.service.CustomerService;
import com.nfjh.spring6.service.OrderService;
import com.nfjh.spring6.service.UserService;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class FirstSpringTest {
/*
向上插入空行：ctrl+alt+enter
向下插入空行：shift+enter
 */

    @Test
    public void testProperties(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc.xml");
        JDBC jdbcBean = applicationContext.getBean("jdbcBean", JDBC.class);
        System.out.println(jdbcBean);
        //JDBC{driver='com.mysql.jdbc.Driver', url='jdbc:mysql://localhost:2022/spring6', username='34838', passwd='root', initialSize='5', maxIdle='10'}

    }

    @Test
    public void test(){
        System.out.println(new Date());
    }
    @Test
    public void testAutoWireByType(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowire.xml");
        Client clientBean = applicationContext.getBean("clientBean2", Client.class);
        clientBean.getUser().testAutoWire();;
        System.out.println(clientBean);
        //user对象已经实例化
        //Client{user=User{username='zhangsan', passwd='1221', age=20}, clientName='QQ'}

    }


    @Test
    public void  testAutoWireByName(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("autowire.xml");
        Client clientBean = applicationContext.getBean("clientBean", Client.class);
        System.out.println(clientBean);
    }

    @Test
    public void test_util_namespace(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("util-namespace.xml");
        Book bookBean = applicationContext.getBean("bookBean", Book.class);
        System.out.println(bookBean);
        Book bookBean2 = applicationContext.getBean("bookBean2", Book.class);
        System.out.println(bookBean2);
        //Book{name=[三体, 活着], ISBN=[1211121, 22332232], type={1=科幻, 2=文学}}
        //Book{name=[流浪地球, 诗经], ISBN=[1211121, 22332232], type={1=科幻, 2=文学}}

    }


    @Test
    public void test_p_namespace(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("p-namespace.xml");
        Client clientBean = applicationContext.getBean("clientBean", Client.class);
        System.out.println(clientBean);
        //Client{user=User{username='zhangsan', passwd='haha', age=0}, clientName='QQ'}

    }




    @Test
    public void testSpecial(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        User specialSymbolsBean = applicationContext.getBean("specialSymbolsBean", User.class);
        System.out.println(specialSymbolsBean);
    }

    @Test
    public void testStrNullInjection(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        User userStrNullBean = applicationContext.getBean("userStrNullBean", User.class);
        System.out.println(userStrNullBean);
        //User{username='', passwd='', age=0}
    }

    @Test
    public void testNUllInjection(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        User userNullBean = applicationContext.getBean("userNullBean", User.class);
        System.out.println(userNullBean);
        System.out.println(userNullBean.getPasswd().toUpperCase());
        /*
        User{username='null', passwd='null', age=0}
        NULL
         */
    }

    @Test
    public void  testPropertiesInjection(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        Person personProBean = applicationContext.getBean("personProBean", Person.class);
        System.out.println(personProBean);
        //Person{userList=null, userSet=null, userMap=null, properties={driver=com.nfjh.hello, url=www.baidu.com}}
    }

    @Test
    public void testMapInjection(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        Person personMapBean = applicationContext.getBean("personMapBean", Person.class);
        System.out.println(personMapBean);
        //Person{userList=null, userSet=null, userMap={1=User{username='zhangsan', passwd='123', age=20}, 2=User{username='张三', passwd='123456', age=21}}}
    }

    @Test
    public void testSetRef(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        Person personBean2 = applicationContext.getBean("personBean2", Person.class);
        System.out.println(personBean2);

    }

    @Test
    public void  testListRef(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        Person personBean = applicationContext.getBean("personBean", Person.class);
        System.out.println(personBean);
        //Person{userList=[User{username='zhangsan', passwd='123', age=20}, User{username='张三', passwd='123456', age=21}], userSet=null}
        //通过此程序可以得知
        //通过级联属性赋值的bean可以通过 id 实例化,拿到其中的值
    }

    @Test
    public void testRefArray(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        Student studentBean = applicationContext.getBean("studentBean", Student.class);
        System.out.println(studentBean);
        //Student{name='张三', lessons=[Lesson{lessonName=[JAVA, MYBATIS, SPRING]}, Lesson{lessonName=[MYSQL, JDBC, AJAX]}]}
    }

    @Test
    public void testSimpleArray(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        Lesson lessonBean = applicationContext.getBean("lessonBean", Lesson.class);
        System.out.println(lessonBean);
        //Lesson{lessonName=[JAVA, MYBATIS, SPRING]}
    }

    @Test
    public void testCascade(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        Client clientBean = applicationContext.getBean("clientBean", Client.class);
        System.out.println(clientBean);
    }

    @Test
    public void testSimpleType(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");
        User userBean = applicationContext.getBean("userBean", User.class);
        System.out.println(userBean);

    }


    @Test
    public void testOrderServiceGenerate(){
        //解析XML,启动Spring容器,实例化所有的Bean,放入容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("set-di.xml");

        //外部bean
        OrderService osBean = applicationContext.getBean("osBeanOut", OrderService.class);
        osBean.generate();

        //内部bean
        OrderService osBeanIn = applicationContext.getBean("osBeanIn", OrderService.class);
        osBeanIn.generate();

    }

    @Test
    public void testSpringCreateBean(){

        ApplicationContext applicationContext= new ClassPathXmlApplicationContext("spring-core.xml");
//        User user = (User) applicationContext.getBean("userBean");
        UserDao userDaoBean = applicationContext.getBean("userDaoBean", UserDao.class);

//        System.out.println(user);
    }

    @Test
    public void testLog4j(){
        //传入需要记录日志的类
        Logger logger = LoggerFactory.getLogger(FirstSpringTest.class);

        logger.debug("这是一个debug日志信息");

    }

    @Test
    public void testInsert(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-core.xml");
        UserService userService = applicationContext.getBean("userService", UserService.class);
        userService.saveUser();
    }

    @Test
    public void testConstructor(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-core.xml");
        CustomerService csbean = applicationContext.getBean("customerServiceBean", CustomerService.class);
        csbean.save();

        System.out.println("----------");
        csbean.save(true);
    }
}
