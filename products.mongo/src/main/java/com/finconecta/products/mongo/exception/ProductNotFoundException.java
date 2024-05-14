package com.finconecta.products.mongo.exception;

public class ProductNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ProductNotFoundException(String message) {
		super(message);
	}

	public ProductNotFoundException(String message, Throwable throwable) {
		super(message, throwable);
	}

}
