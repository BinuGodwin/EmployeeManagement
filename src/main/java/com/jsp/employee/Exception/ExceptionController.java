package com.jsp.employee.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class ExceptionController 
{
	@ExceptionHandler(value = PhoneNumberNotFoundException.class)
	public ResponseEntity<?> phoneNumberNotFoundException(PhoneNumberNotFoundException exception)
	{
		ApiError apiError = new ApiError();
		apiError.setClassName(exception.getClass());
		apiError.setDateTime(LocalDateTime.now());
		apiError.setMessage(exception.getMessage());
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = IncorrectPassword.class)
	public ResponseEntity<?> IncorrectPassword(IncorrectPassword exception)
	{
		ApiError apiError = new ApiError();
		apiError.setClassName(exception.getClass());
		apiError.setDateTime(LocalDateTime.now());
		apiError.setMessage(exception.getMessage());
		return new ResponseEntity<>(HttpStatus.NOT_FOUND);

	}
	
	@ExceptionHandler(value = EmployeeNameNotFoundException.class)
	public ResponseEntity<?> nameNotFoundException(EmployeeNameNotFoundException exception)
	{
		ApiError error =  new ApiError();
		error.setDateTime(LocalDateTime.now());
		error.setClassName(exception.getClass());
		error.setMessage(exception.getMessage());
		return new ResponseEntity<>(error,HttpStatus.NOT_FOUND);
	}
}
