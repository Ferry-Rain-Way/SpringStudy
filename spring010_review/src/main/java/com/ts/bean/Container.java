package com.ts.bean;

import java.util.*;

public class Container {
    //Array
    String [] arr ;
    Wifi [] refArr;

    //List

    /*List”不能注入“java.util.ArrayList<java.lang.String>”类型的属性
    propertyOf'java.util.ArrayList<java.lang.String>'TypeCannotBeInjectedBy'List'*/
//    ArrayList<String> arrayList ;
//    ArrayList<Wifi> RefList ;

    List<String> list ;
    List<Wifi> refList;



    //Set
    Set<String> set;
    Set<Wifi> refSet;

    //Map
    Map<String,String> map;
    Map<Wifi,String> refMap;

    //Properties
    Properties properties;

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public void setRefArr(Wifi[] refArr) {
        this.refArr = refArr;
    }

//    public void setArrayList(ArrayList<String> arrayList) {
//        this.arrayList = arrayList;
//    }
//
//    public void setRefList(ArrayList<Wifi> refList) {
//        RefList = refList;
//    }
    public void setList(List<String> list) {
        this.list = list;
    }

    public void setRefList(List<Wifi> refList) {
        this.refList = refList;
    }
    public void setSet(Set<String> set) {
        this.set = set;
    }

    public void setRefSet(Set<Wifi> refSet) {
        this.refSet = refSet;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setRefMap(Map<Wifi, String> refMap) {
        this.refMap = refMap;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    @Override
    public String toString() {
        return "Container{" +
                "arr=" + Arrays.toString(arr) +
                ", refArr=" + Arrays.toString(refArr) +
                ", list=" + list +
                ", refList=" + refList +
                ", set=" + set +
                ", refSet=" + refSet +
                ", map=" + map +
                ", refMap=" + refMap +
                ", properties=" + properties +
                '}';
    }
}
