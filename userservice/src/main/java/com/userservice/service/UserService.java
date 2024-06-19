package com.userservice.service;

import java.util.List;
import java.util.Optional;

import com.userservice.model.User;

public interface UserService {

	User saveUser(User user);

	List<User> getUser();

	Optional<User> findByUserId(String userId);
	
	

}
