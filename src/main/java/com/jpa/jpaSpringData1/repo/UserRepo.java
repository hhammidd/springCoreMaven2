package com.jpa.jpaSpringData1.repo;


import com.jpa.jpaDemo2.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<Users,Integer> {

}
