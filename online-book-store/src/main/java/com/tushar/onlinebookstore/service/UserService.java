package com.tushar.onlinebookstore.service;

import java.util.List;

import com.tushar.onlinebookstore.entity.User;

public interface UserService {

	public List<User> getAllUsers();
	
	public User getUserByUsername(String username);
}
