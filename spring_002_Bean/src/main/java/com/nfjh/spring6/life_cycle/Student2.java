package com.nfjh.spring6.life_cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;

public class Student2
        implements BeanNameAware, BeanClassLoaderAware, BeanFactoryAware,
        InitializingBean,
        DisposableBean  {

    private  int age;

    public Student2() {
        System.out.println("无参构造执行了!!!");
    }

    public void setAge(int age) {
        System.out.println("赋值执行了");
        this.age = age;
    }


    public void initBean(){
        System.out.println("init初始化执行了!!!");
    }

    public void sleep(){
        System.out.println("bean对象正在使用中!!!");
    }

    public  void destroyBean(){
        System.out.println("destroyBean方法执行了!!!");
    }



/*** BeanNameAware, BeanClassLoaderAware, BeanFactoryAware***********/

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("setBeanClassLoader");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("setBeanFactory");
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("setBeanName");
    }


    /**InitializingBean**************/
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }


    /**DisposableBean***************/
    @Override
    public void destroy() throws Exception {
        System.out.println("destroy");
    }





}
