package creditcard.exception;

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
class CardNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(CardNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String cardNotFoundHandler(CardNotFoundException ex) {
		return ex.getMessage();
	}
}
