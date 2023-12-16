package com.nfjh.spring6.life_cycle;

public class Student {
    private  int age;

    public Student() {
        System.out.println("无参构造执行了!!!");
    }

    public void setAge(int age) {
        System.out.println("赋值执行了");
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                '}';
    }

    public void init(){
        System.out.println("init初始化执行了!!!");
    }

    public void sleep(){
        System.out.println("bean对象正在使用中!!!");
    }

    public  void destroy(){
        System.out.println("destroy方法执行了!!!");
    }

}
