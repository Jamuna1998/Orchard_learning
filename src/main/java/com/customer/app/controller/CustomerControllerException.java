package com.customer.app.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.customer.app.exception.CustomerNotFoundException;
import com.customer.app.exception.NoCityFound;



@ControllerAdvice
public class CustomerControllerException {

	@ExceptionHandler(value=CustomerNotFoundException.class)
	public ResponseEntity<Object> exception(CustomerNotFoundException exception){
		return new ResponseEntity<>("Customer not found,no such id",HttpStatus.NOT_FOUND);
	}
	@ExceptionHandler(value=NoCityFound.class)
	public ResponseEntity<Object> exception(NoCityFound exception){
		return new ResponseEntity<>("No such city found",HttpStatus.NOT_FOUND);
	}
}
