package com.vti.lesson07.exceptions;

public class MyInvalidAgeException extends Exception {

	private static final long serialVersionUID = -3243575470004539260L;

	public MyInvalidAgeException(String message) {
		super(message);
	}

}