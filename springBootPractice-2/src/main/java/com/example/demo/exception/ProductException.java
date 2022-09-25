package com.example.demo.exception;

@SuppressWarnings(value = "serial")
public class ProductException extends RuntimeException{

	public ProductException() {
		super();
	}

	public ProductException(String message) {
		super(message);
	}

}
