package com.example.demo.aop.asspects;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(2)
public class SecurityAspect {

    @Before("com.example.demo.aop.asspects.MyPointcuts.allAddMethod()")
    public void beforeAddSecurityAdvice() {
        System.out.println("beforeGetSecurityAdvice : проверка прав на получение книг");
        System.out.println("-------------------------------------------------------------");

    }
}