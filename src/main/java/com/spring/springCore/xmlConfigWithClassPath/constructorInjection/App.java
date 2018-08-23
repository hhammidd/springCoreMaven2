package com.spring.springCore.xmlConfigWithClassPath.constructorInjection;

import com.spring.springCore.xmlConfigWithClassPath.constructorInjection.model.Tyre;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // When  instead of setter used constructor in xml you change ....
        Tyre t = (Tyre) context.getBean("tyre");

        System.out.println(t);
    }
}
