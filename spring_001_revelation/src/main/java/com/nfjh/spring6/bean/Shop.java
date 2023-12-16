package com.nfjh.spring6.bean;


import java.util.Date;

public class Shop {
    private  String address;
    private String name;
    private Date businessHours;

    public Shop(){}

    public Shop(String address, String name, Date businessHours) {
        this.address = address;
        this.name = name;
        this.businessHours = businessHours;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBusinessHours(Date businessHours) {
        this.businessHours = businessHours;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", businessHours=" + businessHours +
                '}';
    }
}
