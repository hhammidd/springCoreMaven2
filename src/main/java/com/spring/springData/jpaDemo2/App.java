package com.spring.springData.jpaDemo2;

import com.spring.springData.jpaDemo2.model.Users;
import com.spring.springData.jpaDemo2.services.UsersService;

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

    }
}
