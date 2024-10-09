package com.demo.bean;

import java.util.Arrays;

public class Student extends Person{
    private int[] marks;

    public Student(int[] marks) {
        this.marks = marks;
    }

    public Student(int id, String name, String address, int[] marks) {
        super(id, name, address);
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }

    public void setMarks(int[] marks) {
        this.marks = marks;
    }

    @Override
    public String toString() {
        return super.toString() +
                " marks = " + Arrays.toString(marks) + " ";
    }
}