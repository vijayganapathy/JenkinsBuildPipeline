package com.learning.microservices.application_one.exceptionHandler;


public class GenericException extends RuntimeException{
	
	public GenericException(String message){
		super(message);
	}

}
