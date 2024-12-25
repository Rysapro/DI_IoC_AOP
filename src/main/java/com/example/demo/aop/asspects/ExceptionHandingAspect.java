package com.example.demo.aop.asspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(3)
public class ExceptionHandingAspect {

    @Before("com.example.demo.aop.asspects.MyPointcuts.allAddMethod()")
    public void beforeAddExceptionHandingAdvice(JoinPoint joinPoint){
        System.out.println("beforeGetExceptionHandingAdvice :  ловим исключения при попытке получить книгу журнал");
        System.out.println("-------------------------------------------------------------");
    }
}