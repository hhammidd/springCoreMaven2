package com.hibernate.fetchHibernate;

import com.jpa.find.teluskoTut.model.Alien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Alien a = new Alien();

        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        // Start transaction
        Transaction tx = session.beginTransaction();

        a = (Alien) session.get(Alien.class , 1);
        // Stop Transaction
        tx.commit();

        System.out.println(a);


    }
}
