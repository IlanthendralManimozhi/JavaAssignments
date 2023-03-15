package task2package;

public class OwnException {

	public static void main(String[] args) {
		System.out.println("Before Exception");
		try {
			throw new Exception("Type Exception");
		} catch (Exception e) {
			System.out.println("Exception catched " +e.getMessage());
		}
		System.out.println("After Exception");

	}

}

