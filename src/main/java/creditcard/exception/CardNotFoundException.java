package creditcard.exception;

/**
 * Created by aneelame
 * Date: 29/Mar/2022
 * This is to handle RuntimeException.
 */

public class CardNotFoundException extends RuntimeException {

	public CardNotFoundException(Long id) {
		super("Could not find card " + id);
	}
}
