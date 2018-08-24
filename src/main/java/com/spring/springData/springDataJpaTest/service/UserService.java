package com.spring.springData.springDataJpaTest.service;

import com.spring.springData.springDataJpaTest.dao.repo.UsersRepository;
import com.spring.springData.springDataJpaTest.model.Users;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class UserService {

    // just for the test without The
    private UsersRepository usersRepository;

    @Autowired
    public UserService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public Iterable<Users> list(){
        return  usersRepository.findAll();
    }

    // some custom Queries
    //1.
    public List<Users> byUsername(String username) {
        username = "hamid";
        return usersRepository.findAllBytheName(username);
    }
}
