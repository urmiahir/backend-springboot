package com.example.demo.exception;

public class ResourceNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 806235039038599208L;

	public ResourceNotFoundException(String msg) {
		super(msg);
	}
	
	
}

