package com.spring.springAOP.teluskoTut;

import com.spring.springAOP.teluskoTut.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringAOPdemo {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Alien a1 = context.getBean(Alien.class);
        a1.show();
    }
}
