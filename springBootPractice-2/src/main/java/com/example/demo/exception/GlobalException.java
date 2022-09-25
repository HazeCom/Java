package com.example.demo.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class GlobalException {
	
	@ExceptionHandler(ProductException.class)
	public ResponseEntity<MyErrorDetails> createdException(ProductException exception, WebRequest request){
		return new ResponseEntity<MyErrorDetails>(new MyErrorDetails(LocalDateTime.now(),exception.getMessage(), request.getDescription(false)),HttpStatus.BAD_REQUEST);
	}
	
	@ExceptionHandler(Exception.class)
	public ResponseEntity<MyErrorDetails> genericException(Exception exception, WebRequest request){
		return new ResponseEntity<MyErrorDetails>(new MyErrorDetails(LocalDateTime.now(), exception.getMessage(), request.getDescription(false)),HttpStatus.BAD_REQUEST);
	}
}
