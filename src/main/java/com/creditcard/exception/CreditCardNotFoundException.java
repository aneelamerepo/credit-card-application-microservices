package com.creditcard.exception;

/**
 * Created by aneelame
 * Date: 29/Mar/2022
 * This is to handle RuntimeException.
 */

public class CreditCardNotFoundException extends RuntimeException {

	public CreditCardNotFoundException(Long id) {
		super("Could not find card " + id);
	}
}
