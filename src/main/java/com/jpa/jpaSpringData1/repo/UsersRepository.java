package com.jpa.jpaSpringData1.repo;

import com.jpa.jpaSpringData1.model.Users;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class UsersRepository {

    public List<Users> findAllUsers(EntityManager em) {
        TypedQuery<Users> usersTypedQuery = em.createQuery("SELECT u FROM com.jpa.jpaSpringData1.model.Users u", Users.class);
        List<Users> usersList = usersTypedQuery.getResultList();
        return usersList;
    }
}
