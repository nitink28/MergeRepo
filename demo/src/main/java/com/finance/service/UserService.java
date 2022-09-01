package com.finance.service;

import java.util.List;

import com.finance.model.User;

public interface UserService {
	public boolean addUser(User user);
	public User findUserByUname(String uname);
	public List<User> getAllUsers();
	//public User findUserByPhone(Long phone);

}
