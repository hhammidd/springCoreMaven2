package com.jpa.jpaDemo2.repo;

import com.jpa.jpaDemo2.model.Users;
import com.jpa.jpaSpringData1.repo.JpaRepo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepo extends JpaRepo {
    void findAll();
}
