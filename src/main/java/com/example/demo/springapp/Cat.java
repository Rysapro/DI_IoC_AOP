package com.example.demo.springapp;

import org.springframework.stereotype.Component;

public class Cat implements Pet{
    public Cat(){
        System.out.println("cat bean is created");
    }
    @Override
    public void say(){
        System.out.println("Myau");
    }
}