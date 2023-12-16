package com.ts.bean;

public class Wifi {
    private String wifiName;
    private String password;


    public Wifi(){
        System.out.println("Wifi 无参构造调用");
    }

    //构造注入

    public Wifi(String wifiName, String password) {
        this.wifiName = wifiName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Wifi{" +
                "wifiName='" + wifiName + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
