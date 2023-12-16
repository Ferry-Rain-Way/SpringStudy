package com.nfjh.spring6.bean;

import java.util.Arrays;

public class Lesson {
    private  String [] lessonName ;

    public void setLessonName(String[] lessonName) {
        this.lessonName = lessonName;
    }

    @Override
    public String toString() {
        return "Lesson{" +
                "lessonName=" + Arrays.toString(lessonName) +
                '}';
    }
}
