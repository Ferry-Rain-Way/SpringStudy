package com.nfjh.spring6.bean;

public class User {
    private String username;
    private  String passwd;
    private int age;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getUsername() {
        return username;
    }

    public String getPasswd() {
        return passwd;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", passwd='" + passwd + '\'' +
                ", age=" + age +
                '}';
    }

    public void testAutoWire(){
        System.out.println("user对象已经实例化");
    }


}
