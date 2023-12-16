package com.nfjh.spring6.factory;

public class SweetFactor_Bean {
    //此方法不在是静态的了
    public  Sweet get(){
        return new Sweet();
    }

    @Override
    public String toString() {
        return "SweetFactory{}";
    }
}
