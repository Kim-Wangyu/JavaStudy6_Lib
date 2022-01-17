package com.google.s4.exception;

public class ChildException extends Exception {  //default 생성자가 있지 않게 
	
	public ChildException() {
		super();
		
	}
	
	public ChildException(String message) {
		super(message);
	}
	

}
