package com.fms.exception;

public class MemberNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
	public MemberNotFoundException(String msg) {
		super(msg);
	}

}
