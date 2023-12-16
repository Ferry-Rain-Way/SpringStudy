package com.nfjh.spring6.bean;

public class Client {
    private User user;
    private String clientName;

    public User getUser() {
        return user;
    }

    public String getClientName() {
        return clientName;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    @Override
    public String toString() {
        return "Client{" +
                "user=" + user +
                ", clientName='" + clientName + '\'' +
                '}';
    }


}
