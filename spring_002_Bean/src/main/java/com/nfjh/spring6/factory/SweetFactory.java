package com.nfjh.spring6.factory;

public class SweetFactory {

    public static Sweet get(){
        return new Sweet();
    }

    @Override
    public String toString() {
        return "SweetFactory{}";
    }
}
