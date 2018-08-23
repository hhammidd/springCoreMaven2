package com.spring.springCore.annotationAppContext.autowiredPrimQualifier.model;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MediaTech implements MobileProcessor {
    public void process() {
        System.out.println("Second Best");
    }
}
