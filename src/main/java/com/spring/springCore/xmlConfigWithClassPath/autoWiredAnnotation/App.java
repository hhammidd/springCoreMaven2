package com.spring.springCore.xmlConfigWithClassPath.autoWiredAnnotation;

import com.spring.springCore.xmlConfigWithClassPath.autoWiredAnnotation.model.Car;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // annotation and xml configuration ... tyre xml and car annotation
        // we have to use autowire annotation
        Car obj = (Car) context.getBean("car");
        obj.drive();

    }
}
