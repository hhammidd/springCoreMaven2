package com.spring.springCore.xmlConfigWithClassPath.beanProperty.model;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {
    public void drive(){
        System.out.println("Bike is driving");
    }

}
