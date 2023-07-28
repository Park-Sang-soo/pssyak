package com.blackyak.b2c.common.exception;

import javax.persistence.EntityNotFoundException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.validation.BindException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.blackyak.b2c.common.code.ExceptionCode;
import com.blackyak.b2c.common.util.ExceptionResponse;


@RestControllerAdvice
public class RestApiExceptionHandler {

	@ExceptionHandler(BindException.class)
    public ExceptionResponse handleBindException(BindException e,
								             HttpServletResponse response ) {
		
		response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		
        return ExceptionResponse.builder()
		        		 .exceptionCode(ExceptionCode.INVALID_REQUEST_PARAMETER.getExceptionCode())
		                 .exceptionMessage(ExceptionCode.INVALID_REQUEST_PARAMETER.getExceptionMessage())
		                 .build();
    }
	
	@ExceptionHandler(HttpRequestMethodNotSupportedException.class)
    public ExceptionResponse handleMethodNotSupportedException(HttpRequestMethodNotSupportedException e,
								             HttpServletResponse response ) {
		
		response.setStatus(HttpServletResponse.SC_METHOD_NOT_ALLOWED);
		
        return ExceptionResponse.builder()
		        		 .exceptionCode(ExceptionCode.METHOD_NOT_ALLOWED.getExceptionCode())
		                 .exceptionMessage(ExceptionCode.METHOD_NOT_ALLOWED.getExceptionMessage())
		                 .build();
    }
	
	@ExceptionHandler(NullPointerException.class)
    public ExceptionResponse handleNullPointerException(NullPointerException e,
								             HttpServletResponse response ) {
		
		response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
		
        return ExceptionResponse.builder()
		        		 .exceptionCode(ExceptionCode.NULL_ARGUMENT_PARAMETER.getExceptionCode())
		                 .exceptionMessage(ExceptionCode.NULL_ARGUMENT_PARAMETER.getExceptionMessage())
		                 .build();
    }
	
	@ExceptionHandler(IllegalArgumentException.class)
    public ExceptionResponse handleIllegalArgumentException(IllegalArgumentException e,
								             HttpServletResponse response ) {
		
		response.setStatus(HttpServletResponse.SC_BAD_REQUEST);
		
        return ExceptionResponse.builder()
		        		 .exceptionCode(ExceptionCode.ILLEGAL_ARGUMENT_PARAMETER.getExceptionCode())
		                 .exceptionMessage(ExceptionCode.ILLEGAL_ARGUMENT_PARAMETER.getExceptionMessage())
		                 .build();
    }
	
	@ExceptionHandler(EntityNotFoundException.class)
    public ExceptionResponse handleEntityNotFoundException(EntityNotFoundException e,
								             HttpServletResponse response ) {
		
		response.setStatus(HttpServletResponse.SC_NOT_FOUND);
		
        return ExceptionResponse.builder()
		        		 .exceptionCode(ExceptionCode.ENTITY_NOT_FOUND.getExceptionCode())
		                 .exceptionMessage(ExceptionCode.ENTITY_NOT_FOUND.getExceptionMessage())
		                 .build();
    }
}
