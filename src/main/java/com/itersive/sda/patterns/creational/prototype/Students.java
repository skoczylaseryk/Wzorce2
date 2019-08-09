package com.itersive.sda.patterns.creational.prototype;

import java.util.LinkedList;
import java.util.List;

public class Students implements Cloneable {
    private List<Student> group;

    public Students() {
        group = new LinkedList<>();
    }

    public Students(List<Student> students) {
        group = students;
    }

    public List<Student> getStudents() {
        return group;
    }

    @Override
    protected Object clone() {
        List<Student> students = new LinkedList<>(this.getStudents());
        return new Students(students);
    }
}
