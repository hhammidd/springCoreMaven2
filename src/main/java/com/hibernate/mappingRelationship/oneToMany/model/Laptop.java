package com.hibernate.mappingRelationship.oneToMany.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Laptop {

    @Id
    private int lid;
    private int lname;

    public int getLid() {
        return lid;
    }

    public void setLid(int lid) {
        this.lid = lid;
    }

    public int getLname() {
        return lname;
    }

    public void setLname(int lname) {
        this.lname = lname;
    }
}
