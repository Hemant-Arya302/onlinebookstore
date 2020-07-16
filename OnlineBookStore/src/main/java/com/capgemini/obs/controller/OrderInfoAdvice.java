package com.capgemini.obs.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.capgemini.obs.exception.OrderInfoException;
import com.capgemini.obs.exception.ErrorInfo;

@RestControllerAdvice
public class OrderInfoAdvice {
	@ExceptionHandler(value = {OrderInfoException.class})
	@ResponseStatus(code=HttpStatus.BAD_REQUEST)
	public ErrorInfo handleException1(Exception ex) {
		return new ErrorInfo(ex.getMessage());
	}

}
