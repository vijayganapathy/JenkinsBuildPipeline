package com.learning.microservices.application_one.contoller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.learning.microservices.application_one.exceptionHandler.GenericException;
import com.learning.microservices.application_one.model.User;
import com.learning.microservices.application_one.service.UserService;

@RestController
public class CrudController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(method = RequestMethod.GET, path = "/user/{userId}/get")
	public String healthCheck(@PathVariable("userId") String userId) {
		System.out.print(userId);
		return userId;
	}
	
	@RequestMapping(method = RequestMethod.GET, path = "get/user/{userId}")
	public Optional<User> getUser(@PathVariable("userId") Long userId) {
		
		Optional<User> user = userService.getUser(userId);
		if(user.isEmpty()) {
			throw new RuntimeException("Test Vj");
		}
		return user;
	}
	
	@RequestMapping(method = RequestMethod.POST, path = "/user/save")
	public User saveUser(@RequestBody User user) {
		
		
		
		return userService.saveuser(user);
	}

}
