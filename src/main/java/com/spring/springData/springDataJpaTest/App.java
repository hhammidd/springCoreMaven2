package com.spring.springData.springDataJpaTest;

import com.spring.springCore.xmlConfigWithClassPath.autoWiredAnnotation.model.Car;

import com.spring.springData.springDataJpaTest.model.Users;
import com.spring.springData.springDataJpaTest.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.util.List;

@EnableJpaRepositories(basePackages = "com.spring.springDataJpa.springDataTest.dao.repo")
public class App {
    public static void main(String[] args) {
        //java config
        //ApplicationContext factory = new AnnotationConfigApplicationContext(Config.class);
        //UserService userService = factory.getBean(UserService.class);


        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        // annotation and xml configuration ... tyre xml and car annotation
        // we have to use autowire annotation
        UserService userService = (UserService) context.getBean("userService");
        userService.drive();

    }
}
