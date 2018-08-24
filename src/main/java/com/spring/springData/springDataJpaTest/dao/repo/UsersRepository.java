package com.spring.springData.springDataJpaTest.dao.repo;

import com.spring.springData.springDataJpaTest.model.Users;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UsersRepository extends CrudRepository<Users,Integer> {

    // xxxx===============================================
    List<Users> findAllBytheName(String username);

}
