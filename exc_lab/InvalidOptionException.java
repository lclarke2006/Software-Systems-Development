/**
 * Extends Exception so it can be thrown
 */

public class InvalidOptionException extends Exception {

	String mg;
	
	InvalidOptionException(String ms) {
		this.mg = ms;
	}
}
