package com.example.demo.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundExecption.class)
	public ResponseEntity<ApiResponse> resourceNotFoundExceptionHandler(ResourceNotFoundExecption ex){
		String message=ex.getMessage();
		ApiResponse apiResponse=new ApiResponse(message);
		return new ResponseEntity<ApiResponse>(apiResponse,HttpStatus.NOT_FOUND);
		
		
	}
}
