package com.example.demo.springapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

public class Person {
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    private int age;



//    @Autowired
//    public Person(@Qualifier("cat") Pet pet){
//        System.out.println("Person is created");
//        this.pet = pet;
//    }

    public Person(Pet pet){
        System.out.println("Person is created");
        this.pet = pet;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        System.out.println("Class Person: set surname");
        this.surname = surname;

    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Class Person: set age");

        this.age = age;
    }


//    public  Person(){
//        System.out.println("Person bean is created");
//    }


    public void setPet(Pet pet){
        System.out.println("Class person: set pet");
        this.pet = pet;
    }
    public void callYourPet(){
        System.out.println("Hello my Pett-y");
        pet.say();
    }
}