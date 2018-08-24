package com.jpa.persist.teluskoTut;

import com.jpa.find.teluskoTut.model.Alien;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class App {
    public static void main(String[] args) {

        Alien a = new Alien();
        a.setAid(6);
        a.setAname("feri");
        a.setTech("gas");

        EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
        EntityManager em = emf.createEntityManager();

        //1. start transaction
        em.getTransaction().begin();
        //2. save
        em.persist(a);
        //3. commit
        em.getTransaction().commit();

        System.out.println("Check kin db it is added one record or nor?");
    }
}
