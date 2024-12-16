package com.synechron.exceptions;

public class DuplicateStudentException extends Exception {

	public DuplicateStudentException(String message, Exception e) {
		super(message, e);
	}

}
