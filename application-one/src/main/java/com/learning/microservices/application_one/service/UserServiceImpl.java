package com.learning.microservices.application_one.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.microservices.application_one.dao.UserDao;
import com.learning.microservices.application_one.model.User;

@Service("userService")
public class UserServiceImpl implements UserService{
	
	@Autowired
	UserDao userDao;

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<User> getUser(Long userID) {
		
		return userDao.findById(userID);
	}

	@Override
	public User saveuser(User user) {
		
		return userDao.save(user);
	}

	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

}
