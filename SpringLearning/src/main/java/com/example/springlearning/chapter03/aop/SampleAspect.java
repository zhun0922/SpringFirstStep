package com.example.springlearning.chapter03.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Aspect //어드바이스를 기술하는 클래스 어노테이션
@Component //인스턴스 생성 위해
public class SampleAspect {
    //Before

}
