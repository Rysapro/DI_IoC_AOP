package com.example.demo.aop;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents(){
        Student st1 = new Student("Aidar Rysaliev", 3, 9.9);
        Student st2 = new Student("Cholpon Avaskanova", 3, 8.9);
        Student st3 = new Student("Dastan Nazyrbekov", 3, 7.9);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public static void main(String[] args) {
        
    }
}