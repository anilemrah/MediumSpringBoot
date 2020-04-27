package com.anilemrah.crudapp.demo.service;

import java.util.Collection;

import com.anilemrah.crudapp.demo.user.User;

public interface UserService {
	User createUser(User user);

	Collection<User> getUsers();
	
	User getUser(String userId);
	
	User updateUser(String userId, User user);
	
	void deleteUser(String userId);
}
