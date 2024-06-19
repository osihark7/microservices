package com.userservice.impl;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.userservice.model.User;
import com.userservice.repository.UserRepository;
import com.userservice.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public User saveUser(User user) {
		String randomUserId = UUID.randomUUID().toString();
		user.setUserId(randomUserId);
		return userRepo.save(user);
	}

	@Override
	public List<User> getUser() {

		return userRepo.findAll();
	}

	@Override
	public Optional<User> findByUserId(String userId) {
		
		return userRepo.findByUserId(userId);
	}



}
