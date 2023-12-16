package com.nfjh.spring6.bean;

public class JDBC {
    private String driver;
    private String url;
    private String username;
    private String passwd;
    private String initialSize;
    private String maxIdle;

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public void setInitialSize(String initialSize) {
        this.initialSize = initialSize;
    }

    public void setMaxIdle(String maxIdle) {
        this.maxIdle = maxIdle;
    }

    @Override
    public String toString() {
        return "JDBC{" +
                "driver='" + driver + '\'' +
                ", url='" + url + '\'' +
                ", username='" + username + '\'' +
                ", passwd='" + passwd + '\'' +
                ", initialSize='" + initialSize + '\'' +
                ", maxIdle='" + maxIdle + '\'' +
                '}';
    }



}
