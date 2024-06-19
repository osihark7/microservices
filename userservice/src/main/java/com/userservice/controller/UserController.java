package com.userservice.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.userservice.model.User;
import com.userservice.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {

	
	@Autowired
	private UserService userService;
	
	@GetMapping("/api")
	public String getMessage() {
		return "Hello";
	}
	
	@PostMapping("/createUser")
	public ResponseEntity<User> createUser(@RequestBody User user){
	     User user1 = 	userService.saveUser(user);
		 return ResponseEntity.status(HttpStatus.CREATED).body(user1);
	}
	

	// Find by userId
	@GetMapping("/getUserbyId/{userId}")
	public ResponseEntity<Optional<User>> getUserById(@PathVariable("userId") String userId){
		Optional<User> data = userService.findByUserId(userId);
		return ResponseEntity.ok(data);
	}
	
	@GetMapping("/getUser")
	public ResponseEntity<List<User>> getUsers(){
		List<User> user = userService.getUser();
		if(user.isEmpty()) {
			 return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}else {
			return ResponseEntity.ok(user);
		}
		
	}
}
