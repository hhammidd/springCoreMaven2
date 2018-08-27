package com.spring.springData.springDataJpaTest.service;

import com.spring.springData.springDataJpaTest.dao.repo.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserService implements Vehicle {

    // just for the test without The
    @Autowired
    private UsersRepository usersRepository;


    public String drive(){
     return usersRepository.findAll();
    }

}
