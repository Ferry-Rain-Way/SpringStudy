package com.nfjh.spring6.bean;

public class Phone {
    private  String phoneName;
    private String phoneType;

    public Phone(String phoneName, String phoneType) {
        this.phoneName = phoneName;
        this.phoneType = phoneType;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneName='" + phoneName + '\'' +
                ", phoneType='" + phoneType + '\'' +
                '}';
    }
}
