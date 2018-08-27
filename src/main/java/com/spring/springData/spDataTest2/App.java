package com.spring.springData.spDataTest2;

import com.spring.springData.spDataTest2.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//@EnableJpaRepositories(basePackages = "com.spring.springData.springDataTest.dao.repo")
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
