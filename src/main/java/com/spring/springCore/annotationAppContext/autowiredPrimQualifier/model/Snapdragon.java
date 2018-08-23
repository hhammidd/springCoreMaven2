package com.spring.springCore.annotationAppContext.autowiredPrimQualifier.model;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements MobileProcessor {
    public void process() {
        System.out.println("World best processor");
    }
}
