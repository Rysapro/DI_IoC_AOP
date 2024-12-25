package com.example.demo.aop;

import org.springframework.stereotype.Component;

@Component("libraryBean")
public class UniLibrary extends AbstractLibrary{

    public void getBook(){
        System.out.println("мы 2курсники берем книгу" );
        System.out.println("-------------------------------------------------------------");
    }


    public void  returnBook(){
        System.out.println("мы возвращаем книгу в Uni library");
        System.out.println("-------------------------------------------------------------");
    }

    public void getMagazin(){
        System.out.println("журнал берем");
        System.out.println("-------------------------------------------------------------");
    }
    public void returnMagazin(){
        System.out.println("возвращаем журнал ");
        System.out.println("-------------------------------------------------------------");
    }

    public void addBook(String person_name, Book book){
        System.out.println("мы добавили книгу" );
        System.out.println("-------------------------------------------------------------");
    }
    public void addMagazin(){
        System.out.println("мы добавили журнал" );
        System.out.println("-------------------------------------------------------------");
    }
}