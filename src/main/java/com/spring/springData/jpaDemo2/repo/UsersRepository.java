package com.spring.springData.jpaDemo2.repo;

import com.spring.springData.jpaDemo2.model.Users;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class UsersRepository {

    public List<Users> findAllUsers(EntityManager em) {
        TypedQuery<Users> usersTypedQuery = em.createQuery("S ELECT u FROM com.jpa.jpaDemo2.model.Users u", Users.class);
        List<Users> usersList = usersTypedQuery.getResultList();
        return usersList;
    }
}
