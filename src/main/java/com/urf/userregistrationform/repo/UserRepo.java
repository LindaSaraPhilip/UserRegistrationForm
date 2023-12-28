package com.urf.userregistrationform.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.urf.userregistrationform.model.User;

@Repository
public interface UserRepo extends JpaRepository<User,Long> {
	
	
	

}
