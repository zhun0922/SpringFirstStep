package com.example.springlearning.chapter03.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;

@Aspect //어드바이스를 기술하는 클래스 어노테이션
@Component //인스턴스 생성 위해
public class SampleAspect {
    /*@Before("execution(* com.example.springlearning.chapter03.dicontroller.*Greet.*(..))")
    public void beforeAdvice(JoinPoint joinPoint){
        System.out.println("==== Before Advice====");
        System.out.println(new SimpleDateFormat("yyyy/MM/dd").format(new java.util.Date()));
        System.out.println(String.format("메서드:%s", joinPoint.getSignature().getName()));
    }*/

    @Around("execution(* com.example.springlearning.chapter03.dicontroller.*Greet.*(..))")
    public Object aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable{
        System.out.println("==== Around Advice====");
        System.out.println("▼▼▼ 처리전 ▼▼▼");
        //지정한 클래스의 메서드 실행
        Object result = joinPoint.proceed();
        System.out.println("▲▲▲ 처리후 ▲▲▲");
        return result;
    }

}
