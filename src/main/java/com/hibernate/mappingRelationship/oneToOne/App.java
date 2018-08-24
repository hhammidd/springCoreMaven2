package com.hibernate.mappingRelationship.oneToOne;

import com.hibernate.mappingRelationship.oneToOne.model.Laptop;
import com.hibernate.mappingRelationship.oneToOne.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import javax.persistence.OneToOne;

public class App {
    public static void main(String[] args) {
        Laptop laptop = new Laptop();
        laptop.setLid(1);
        laptop.setLid(2);

        Student s = new Student();
        s.setRollno(1);
        s.setName("hamid");
        s.setMarks("110");

        s.setLaptop(laptop);

        Configuration config = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
        SessionFactory sf = config.buildSessionFactory();
        Session session = sf.openSession();

        session.beginTransaction();

        session.save(laptop);
        session.save(s);

        session.getTransaction().commit();

    }
}
