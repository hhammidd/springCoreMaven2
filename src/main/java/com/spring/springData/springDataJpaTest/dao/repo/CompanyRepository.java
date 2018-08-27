package com.spring.springData.springDataJpaTest.dao.repo;

import com.spring.springData.springDataJpaTest.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CompanyRepository extends JpaRepository<Users,Integer>{
}
