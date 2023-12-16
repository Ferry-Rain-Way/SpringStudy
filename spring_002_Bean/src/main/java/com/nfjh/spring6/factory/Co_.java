package com.nfjh.spring6.factory;

import java.util.Date;

public class Con {
    private Date date;
    private String clientLog;
    private  String clientType;



    public void setDate(Date date) {
        this.date = date;
    }
    public void setClientType(String clientType) {
        this.clientType = clientType;
    }

    public void setClientLog(String clientLog) {
        this.clientLog = clientLog;
    }

    @Override
    public String toString() {
        return "Con{" +
                "date=" + date +
                ", clientLog='" + clientLog + '\'' +
                ", clientType='" + clientType + '\'' +
                '}';
    }
}
