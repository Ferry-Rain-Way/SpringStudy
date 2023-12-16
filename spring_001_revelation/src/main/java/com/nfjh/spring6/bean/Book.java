package com.nfjh.spring6.bean;

import java.util.List;
import java.util.Properties;
import java.util.Set;

public class Book {
    private List<String> name;
    private Set<String> ISBN;
    private Properties type;

    public void setName(List<String> name) {
        this.name = name;
    }

    public void setISBN(Set<String> ISBN) {
        this.ISBN = ISBN;
    }

    public void setType(Properties type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name=" + name +
                ", ISBN=" + ISBN +
                ", type=" + type +
                '}';
    }
}
