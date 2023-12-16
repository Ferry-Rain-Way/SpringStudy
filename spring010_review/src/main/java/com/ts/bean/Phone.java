package com.ts.bean;

public class Phone {
    private String phoneNumber;
    private User phoneUser;

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setPhoneUser(User phoneUser) {
        this.phoneUser = phoneUser;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public User getPhoneUser() {
        return phoneUser;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "phoneNumber='" + phoneNumber + '\'' +
                ", phoneUser=" + phoneUser +
                '}';
    }
}
