package com.userservice.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.userservice.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{

	
	@Query(value = "SELECT u FROM User u WHERE u.userId= :userId")
	Optional<User> findByUserId(String userId);

}
