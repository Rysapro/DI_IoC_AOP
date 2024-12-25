package com.example.demo.aop.asspects;

import com.example.demo.aop.Book;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class LoggingAspect {

    @Before("com.example.demo.aop.asspects.MyPointcuts.allAddMethod()")
    public void beforeAddLoggingAdvice(JoinPoint joinPoint) {

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("methodSignature = " + methodSignature);
        System.out.println("methodSignature.getMethod() = " + methodSignature.getMethod());
        System.out.println("methodSignature.getReturnType() = " + methodSignature.getReturnType());
        System.out.println("methodSignature.getName() = " + methodSignature.getName());

        if (methodSignature.getName().equals("addBook")) {
            Object[] arguments = joinPoint.getArgs();
            for (Object obj : arguments) {
                if (obj instanceof Book) {
                    Book myBook = (Book) obj;
                    System.out.println(
                            "Информация о книге: название - " + myBook.getName() +
                            ", автор - " + myBook.getAuthor() +
                            ", год издания - " + myBook.getYearOfPublication()
                    );
                }
                else if(obj instanceof String){
                    System.out.println("книгу в библиотеку добавляет "+obj);
                }
            }
        }


        System.out.println("beforeGetLoggingAdvice : логирование попытка получить книгу/журнал");
        System.out.println("-------------------------------------------------------------");

    }


//    @Pointcut("execution(* com.example.demo.aop.UniLibrary.*(..))")
//    private void allMethodFromUnionLibrary(){}
//
//    @Pointcut("execution(public void com.example.demo.aop.UniLibrary.returnMagazin())")
//    private void returnMagazinFromUniLibrary(){}
//
//    @Pointcut("allMethodFromUnionLibrary() && !returnMagazinFromUniLibrary()")
//    private void allMethodsExceptReturnMagazinFromUniLibrary(){}
//
//    @Before("allMethodsExceptReturnMagazinFromUniLibrary()")
//    public void beforeAllMethods (){}

//    @Pointcut("execution(* com.example.demo.aop.UniLibrary.get*())")
//    private void allGetMethodsFromUniLibrary() {}
//
//    @Pointcut("execution(* com.example.demo.aop.UniLibrary.return*())")
//    private void allReturnMethodsFromUniLibrary(){}
//
//    @Pointcut("allGetMethodsFromUniLibrary() || allReturnMethodsFromUniLibrary()")
//    private void  allGetAndReturnMethodsFromUniLibrary(){}
//
//    @Before("allGetMethodsFromUniLibrary()")
//    public void beforeGetLoggingAdvice(){
//        System.out.println("beforeGetLoggingAdvice : writing log #1");
//    }
//    @Before("allReturnMethodsFromUniLibrary()")
//    public void beforeReturnLoggingAdvice(){
//        System.out.println("beforeReturnLoggingAdvice : writing log #2");
//    }
//
//    @Before("allGetAndReturnMethodsFromUniLibrary()")
//    public void beforeGetAndReturnLoggingAdvice(){
//        System.out.println("beforeGetAndReturnLoggingAdvice : writing log #3");
//    }


}