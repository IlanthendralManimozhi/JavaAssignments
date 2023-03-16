package task2package;
public class OwnException {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			throw new Exception("Type Exception");//own exception created by creating object for exception
		} catch (Exception e) {
			System.out.println("Exception catched " +e.getMessage());// caught the exception.
		}
		System.out.println("After Exception");

	}

}

