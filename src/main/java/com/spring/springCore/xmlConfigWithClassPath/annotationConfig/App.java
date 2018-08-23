package com.spring.springCore.xmlConfigWithClassPath.annotationConfig;

import com.spring.springCore.xmlConfigWithClassPath.annotationConfig.model.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        //Vehicle car1 = new Car();
        //car1.drive();
        // Use Spring just say give me a vehicle without new
        // there are 2 class : 1. ApplicationContext 2. BeanFactory
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Vehicle obj = (Vehicle) context.getBean("bike");

        Vehicle obj2 = (Vehicle) context.getBean("car");
        obj.drive();
        obj2.drive();
    }
}
