package com.urf.userregistrationform.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.urf.userregistrationform.model.User;

@Service
public interface UserService {
	
	public User saveUser(User user);
	public List<User> saveallUsers(List<User> users);
	public User getUser(Long id);
	public List<User> getUsers();
	public String deleteUser(Long id);
	public User updateUser(User user);
	

}
