package com.finance.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.finance.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	public User findUserByUname(String uname);
	//public User findUserByPhone(Long phone);
	
}