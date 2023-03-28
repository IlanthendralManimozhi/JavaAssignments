package momento;

public class InvalidTimeException extends Exception {
	String message;

	public InvalidTimeException(String message) {
		this.message = message;
	}

	public String toString() {
		return "Exception is..............:" + this.message;
	}
}
