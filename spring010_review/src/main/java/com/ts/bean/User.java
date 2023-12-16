package com.ts.bean;

import java.util.Arrays;

public class User {
    private String userName;
    private String [] otherPhoneNumber;

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setOtherPhoneNumber(String[] otherPhoneNumber) {
        this.otherPhoneNumber = otherPhoneNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", otherPhoneNumber=" + Arrays.toString(otherPhoneNumber) +
                '}';
    }

    //使用级联属性赋值,需要提供get方法
    public String getUserName() {
        return userName;
    }

    public String[] getOtherPhoneNumber() {
        return otherPhoneNumber;
    }
}
