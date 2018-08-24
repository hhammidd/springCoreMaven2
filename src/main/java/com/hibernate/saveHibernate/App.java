package com.hibernate.saveHibernate;

import com.jpa.find.teluskoTut.model.Alien;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main(String[] args) {
        Alien a = new Alien();
        a.setAid(14);
        a.setAname("fufau");
        a.setTech("net");

        Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);

        SessionFactory sf = con.buildSessionFactory();
        Session session = sf.openSession();

        // Start transaction
        Transaction tx = session.beginTransaction();
        session.save(a);
        // Stop Transaction
        tx.commit();


    }
}
