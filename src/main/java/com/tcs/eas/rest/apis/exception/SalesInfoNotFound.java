package com.tcs.eas.rest.apis.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Sales information does not exist", value = HttpStatus.NOT_FOUND)
public class SalesInfoNotFound extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5043004994446459598L;

	public SalesInfoNotFound(String message) {
		super(message);
	}

}
