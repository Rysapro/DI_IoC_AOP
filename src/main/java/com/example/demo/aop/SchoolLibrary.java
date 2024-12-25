package com.example.demo.aop;

import org.springframework.stereotype.Component;

@Component("schoolLibraryBean")
public class SchoolLibrary extends AbstractLibrary{

    public void getBook(){
        System.out.println("мы школьники берем книги");
    }
}