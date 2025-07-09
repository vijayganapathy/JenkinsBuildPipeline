package com.learning.microservices.application_one.service;

import java.util.List;
import java.util.Optional;

import com.learning.microservices.application_one.model.User;

public interface UserService {
	
	public List<User> getAllUsers();
	public Optional<User> getUser(Long userID);
	public User saveuser(User user);
	public User updateUser(User user);

}
