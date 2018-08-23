package com.spring.springAOP.teluskoTut;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

// advice --> what ? 1.before (before calling show) 2. after 3. around
//PointCut --> where ?
@Component
@Aspect
@EnableAspectJAutoProxy
public class Helper {

    @Before("execution(public void show())")
    public void log() {
        System.out.println("show called log()");
    }
}
