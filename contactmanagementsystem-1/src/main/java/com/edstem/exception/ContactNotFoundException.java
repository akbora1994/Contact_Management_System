package com.edstem.exception;

public class ContactNotFoundException extends RuntimeException{
	
	public ContactNotFoundException() {
		
	}
	
	public ContactNotFoundException(String message) {
		super(message);
	}

}
