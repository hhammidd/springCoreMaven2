package com.jpa.jpaSpringData1;

import com.jpa.jpaSpringData1.config.AppConfig;
import com.jpa.jpaSpringData1.model.Users;
import com.jpa.jpaSpringData1.services.UserSer;
import com.jpa.jpaSpringData1.services.UsersService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;



public class App {
    public static void main(String[] args) {

        UsersService us = new UsersService();
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("Users2");
        EntityManager em = emf.createEntityManager();

        //em.getTransaction().begin();
        List<Users> users = us.findAllUsersService(em);

        for (Users s : users){
            System.out.println(s.getPass());
        }

        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        UserSer s7 = factory.getBean(UserSer.class);
        s7.config();

    }
}
