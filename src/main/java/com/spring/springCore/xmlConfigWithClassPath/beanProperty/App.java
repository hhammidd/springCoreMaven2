package com.spring.springCore.xmlConfigWithClassPath.beanProperty;

import com.spring.springCore.xmlConfigWithClassPath.beanProperty.model.Tyre;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Tyre t = (Tyre) context.getBean("tyre");
        // here there is variable brand in the Tyre so in xml add the dependency
        System.out.println(t);
    }
}
