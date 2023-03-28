package flyweightpattern;

public class InvalidChoiceException extends Exception {
	String message;

	public InvalidChoiceException(String message) {
		this.message = message;
	}

	public String toString() {
		return "Exception is..............:" + this.message;
	}
}
