package com.nfjh.bank.pojo;

public class Account {
    //账号
    private String actno;
    //余额
    private Double balance;

    public Account() {
    }

    public Account(String actno, Double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public Double getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "actno='" + actno + '\'' +
                ", balance=" + balance +
                '}';
    }


}
