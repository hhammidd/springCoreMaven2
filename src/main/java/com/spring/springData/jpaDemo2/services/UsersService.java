package com.spring.springData.jpaDemo2.services;

import com.spring.springData.jpaDemo2.model.Users;
import com.spring.springData.jpaDemo2.repo.UsersRepository;

import javax.persistence.EntityManager;
import java.util.List;

public class UsersService {

    UsersRepository usersRepository = new UsersRepository();
    //private UsersRepository usersRepository;
    // insert User

    // delete user

    // findAll user
    public List<Users> findAllUsersService(EntityManager em){
        return usersRepository.findAllUsers(em);
    }
    // find User
}
