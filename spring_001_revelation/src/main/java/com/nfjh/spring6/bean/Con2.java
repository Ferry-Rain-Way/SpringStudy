package com.nfjh.spring6.bean;

public class Con2 {
    private User user;
    private String clientLog;
    private  String clientType;

    public Con2(User user, String clientLog, String clientType) {
        this.user = user;
        this.clientLog = clientLog;
        this.clientType = clientType;
    }

    @Override
    public String toString() {
        return "Con2{" +
                "user=" + user +
                ", clientLog='" + clientLog + '\'' +
                ", clientType='" + clientType + '\'' +
                '}';
    }
}
