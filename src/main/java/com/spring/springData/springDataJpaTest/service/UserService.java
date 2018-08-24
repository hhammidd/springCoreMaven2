package com.spring.springData.springDataJpaTest.service;

import com.spring.springData.springDataJpaTest.dao.repo.UsersRepository;
import com.spring.springData.springDataJpaTest.model.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {



    // just for the test without The
    @Autowired
    private UsersRepository usersRepository;

    // manually add
    @PostConstruct
    public void initDB(){
        // test purpose
        List<Users> usersList = new ArrayList<Users>();
        usersList.add(new Users(11,"a","aa"));
        usersList.add(new Users(12,"b","aa"));
        usersList.add(new Users(13,"c","cc"));
        usersRepository.saveAll(usersList);
    }

    public List<Users> getUsers(){
        return usersRepository.findAll();
    }

}
