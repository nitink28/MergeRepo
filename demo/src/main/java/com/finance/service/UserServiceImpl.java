package com.finance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.finance.model.User;
import com.finance.repository.UserRepository;
@Service
@Transactional

public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepo;
	
	@Override
	public boolean addUser(User user) {
		userRepo.save(user);
		return true;
	}

	@Override
	public User findUserByUname(String userName) {
		return userRepo.findUserByUname(userName);
	}

	@Override
	public List<User> getAllUsers() {
		return userRepo.findAll();
	}

//	@Override
//	public User findUserByPhone(Long phone) {
//		return userRepo.findUserByPhone(phone);
//	}

}
