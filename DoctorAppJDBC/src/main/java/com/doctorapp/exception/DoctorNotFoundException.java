package com.doctorapp.exception;

public class DoctorNotFoundException extends Exception{
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public DoctorNotFoundException() {
	    }

	    public DoctorNotFoundException(String message) {
	        super(message);
	    }

}
