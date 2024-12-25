package com.example.demo.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig2.class);

        UniLibrary library = context.getBean("libraryBean", UniLibrary.class);
        Book book = context.getBean("book", Book.class);
        library.getBook();
        library.addBook("Aidar", book);
        library.addMagazin();
//        library.returnMagazin();
//        library.addMagazin();

//        library.returnBook();
//        library.getMagazin();
//
//        SchoolLibrary schoolLibrary = context.getBean("schoolLibraryBean", SchoolLibrary.class);
//        schoolLibrary.getBook();



        context.close();
    }

}