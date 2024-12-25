package com.example.demo.springapp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");

//        Dog myDog = context.getBean( Dog.class);
//        myDog.say();

        Person person = context.getBean("personBean", Person.class);
        person.callYourPet();
        System.out.println(person.getSurname());
        context.close();
    }
}