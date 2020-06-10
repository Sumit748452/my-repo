package com.oredoo.controller;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class ExceptionController {
	
	private static final Logger LOGGER = LogManager.getLogger(ExceptionController.class);

	/*
	 * @Value("${server.context-path}") String contextPath;
	 */
	
    @ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public String handleError405(HttpServletRequest request, Exception e) {
    	LOGGER.info("GET Method Not Support Occured:: URL="+request.getRequestURL());

		return "redirect:/success";
    }
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public String handleErrorMissing(HttpServletRequest request, Exception e) {
    	LOGGER.info("Missing Params Occured:: URL="+request.getRequestURL());

		return "redirect:/success";
    }
    @ExceptionHandler(SQLException.class)
	public String handleSQLException(HttpServletRequest request, Exception ex){
    	LOGGER.info("SQLException Occured:: URL="+request.getRequestURL());
		return "redirect:/success";
	}
	
	@ResponseStatus(value=HttpStatus.NOT_FOUND, reason="IOException occured")
	@ExceptionHandler(IOException.class)
	public String handleIOException(){
		LOGGER.error("IOException handler executed");
		return "redirect:/success";

		//returning 404 error code
	}
}
	