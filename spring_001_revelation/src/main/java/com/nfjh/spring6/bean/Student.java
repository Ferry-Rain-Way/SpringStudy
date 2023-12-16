package com.nfjh.spring6.bean;

import java.util.Arrays;

public class Student {
    private String name;

    private Lesson  [] lessons;

    public void setLessons(Lesson[] lessons) {
        this.lessons = lessons;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", lessons=" + Arrays.toString(lessons) +
                '}';
    }
}
