package com.nfjh.spring6.factory;

public class Sweet {
    public Sweet(){}
    public void getType(){
        System.out.println("这是一个水果糖");
    }

    @Override
    public String toString() {
        return "Sweet{}";
    }
}
