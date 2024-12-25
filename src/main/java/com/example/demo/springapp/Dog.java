package com.example.demo.springapp;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

public class Dog implements Pet{

    public Dog(){
        System.out.println("dog bean created");
    }
    @Override
    public void say(){
        System.out.println("gaw-gaw");
    }

//    @PostConstruct
//    public void init(){
//        System.out.println("Class dog: init method");
//    }
//
//    @PreDestroy
//    public void destroy(){
//        System.out.println("Class dog: destroy method");
//    }
}