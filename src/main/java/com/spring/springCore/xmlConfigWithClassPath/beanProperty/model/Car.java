package com.spring.springCore.xmlConfigWithClassPath.beanProperty.model;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    public void drive(){
        System.out.println("CAr is driving");
    }
}
