package com.urf.userregistrationform.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.urf.userregistrationform.model.User;
import com.urf.userregistrationform.repo.UserRepo;
import com.urf.userregistrationform.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepo repo;
	
	@Override
	public User saveUser(User user) {
		
		return repo.save(user);
	}

	@Override
	public List<User> saveallUsers(List<User> users) {
		
		return repo.saveAll(users);
	}

	@Override
	public User getUser(Long id) {
		
		return repo.findById(id).orElse(null);
	}

	@Override
	public List<User> getUsers() {
		
		return  repo.findAll();
	}

	@Override
	public String deleteUser(Long id) {
		repo.deleteById(id);
		return id+"Userid is deleted";
	}

	@Override
	public User updateUser(User user) {
		User newUser=new User();
		newUser.setUserid(user.getUserid());
		newUser.setFname(user.getFname());
		newUser.setLname(user.getLname());
        newUser.setEmail(user.getEmail());
        newUser.setMobile(user.getMobile());
		
		return repo.save(newUser);
	}

}
