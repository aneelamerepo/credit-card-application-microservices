package com.creditcard.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
/**
 * Created by aneelame
 * Date: 29/Mar/2022
 * This is an exception handler.
 */
@ControllerAdvice
class CreditCardNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(CreditCardNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String cardNotFoundHandler(CreditCardNotFoundException ex) {
		return ex.getMessage();
	}
}
