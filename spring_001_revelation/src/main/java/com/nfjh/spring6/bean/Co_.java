package com.nfjh.spring6.bean;

import java.util.Date;

public class Con {
    private Date date;
    private String clientLog;
    private  String clientType;

    /*给c命名空间练习用*/
    public Con(Date date, String clientLog, String clientType) {
        this.date = date;
        this.clientLog = clientLog;
        this.clientType = clientType;
    }

    @Override
    public String toString() {
        return "ClientCon{" +
                "date=" + date +
                ", clientLog='" + clientLog + '\'' +
                ", clientType='" + clientType + '\'' +
                '}';
    }

}
