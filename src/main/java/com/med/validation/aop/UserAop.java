package com.med.validation.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class UserAop {

    @Before(value = "execution(* com.med.validation.service.UserService.*(..))")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("before UserService Method");
        System.out.println(joinPoint.getClass());
    }

    @After(value = "execution(* com.med.validation.service.UserService.*(..))")
    public void afterAdvice(JoinPoint joinPoint){
        System.out.println("after UserService Method");
    }

    @AfterReturning(value = "execution(* com.med.validation.service.UserService.*(..))")
    public void afterReturning(JoinPoint joinPoint){
        System.out.println("after returning UserService Method");
    }

    @AfterThrowing(value = "execution(* com.med.validation.service.UserService.*(..))")
    public void afterThrowing(JoinPoint joinPoint){
        System.out.println("after Throwing UserService Method");
    }
}
