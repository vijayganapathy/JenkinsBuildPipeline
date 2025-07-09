package com.learning.microservices.application_one.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.learning.microservices.application_one.model.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
	
	 

}
