package com.jpa.jpaSpringData1.services;

import com.jpa.jpaSpringData1.model.Users;
import com.jpa.jpaSpringData1.repo.UsersRepository;

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
