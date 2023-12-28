package com.urf.userregistrationform.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.urf.userregistrationform.model.User;
import com.urf.userregistrationform.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService service;
	
	@PostMapping("/addUser")
	public User addUser(@RequestBody User user)
	{
		return service.saveUser(user);
	}
	
	@PostMapping("/addUsers")
	public List<User> addUsers(@RequestBody List<User> users)
	{
		return service.saveallUsers(users);
	}
	
	@GetMapping("/getUser/{id}")
	public User getaUser(@PathVariable Long id)
	{
		return service.getUser(id);
	}
	
	
	@GetMapping("/getUsers")
	public List<User> getUsers()
	{
		return service.getUsers();
	}
	
	@PutMapping("/updateUser")
	public User updateaUser(@RequestBody User user)
	{
		return service.updateUser(user);
	}
	
	@DeleteMapping("/deleteUser/{id}")
	public String RemoveUser(@PathVariable Long id)
	{
		return service.deleteUser(id);
		
	}
	

}
