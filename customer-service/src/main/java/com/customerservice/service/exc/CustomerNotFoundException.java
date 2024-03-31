package com.customerservice.service.exc;

@SuppressWarnings("serial")
public class CustomerNotFoundException extends RuntimeException{
	
	private String message;
	
	public CustomerNotFoundException(String message) {
		super(message);
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}
	

}
