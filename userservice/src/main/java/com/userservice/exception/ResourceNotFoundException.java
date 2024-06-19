package com.userservice.exception;

public class ResourceNotFoundException extends RuntimeException{
	
	private static final long serialVersionUID = -5275573549091355896L;

	public ResourceNotFoundException() {
		
		super("Resource not found on server..");
	}
	
	public ResourceNotFoundException(String message) {
		super(message);
	}


}
