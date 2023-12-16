package com.nfjh.spring6.bean;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Person {
    private List<User> userList;
    private Set<User> userSet;
    private Map<Integer,User> userMap;
/*虽然properties也是Map但是他的注入方式与Map不同*/
    Properties properties ;

    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    public void setUserMap(Map<Integer, User> userMap) {
        this.userMap = userMap;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public void setUserSet(Set<User> userSet) {
        this.userSet = userSet;
    }

    @Override
    public String toString() {
        return "Person{" +
                "userList=" + userList +
                ", userSet=" + userSet +
                ", userMap=" + userMap +
                ", properties=" + properties +
                '}';
    }
}
