package org.dxctraining.exceptions;

public class CustomerNotFoundException extends RuntimeException{
	public CustomerNotFoundException(String msg) {
		super(msg);
	}

}