package com.userservice.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="micro_users")
public class User {
	
	@Id
	@Column(name="user_id")
	private String userId;
	
	@Column(name="name", length=20)
	private String name;
	
	@Column(name="email", length=100)
	private String email;
	
    @Column(name="about", length=200)
	private String about;

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

    
    
}
