package com.spring.springData.spDataTest2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService implements Vehicle {

    // just for the test without The
    @Autowired
    //private UsersRepository usersRepository;
    private Tyre tyre;

    public Tyre getTyre() {
        return tyre;
    }

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    public void drive(){
        System.out.println("Here Samsung: " +tyre  );
    }

}
