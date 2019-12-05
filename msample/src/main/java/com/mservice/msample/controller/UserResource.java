package com.mservice.msample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.mservice.msample.bean.User;
import com.mservice.msample.dao.UserDao;

@RestController
public class UserResource {

	@Autowired
	private UserDao userservice;
	
	@GetMapping(path="/users")
	List<User>  retriveAllUsers()
	{
		return userservice.findAll();
		
	}
	
	@GetMapping(path="/users/{id}")
	User  retriveAllUsers(@PathVariable int id)
	{
		return userservice.finaOne(id);
		
}
	@PostMapping("/user")
	void createUser(@RequestBody User user)
	{
	User savedUser = userservice.save(user);
	System.out.println(savedUser);
	}
}