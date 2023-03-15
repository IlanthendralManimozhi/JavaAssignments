package task2package;

public class ExceptionFromPrevTask {
	public static void main(String[] args) throws Exception {
		System.out.println("Before Exception");//Exception thrown is caught.
		try {
			throw new Exception("Type Exception");
		} catch (Exception e) {
			System.out.println("Exception catched " +e.getMessage());
		}
		new WithoutCatch().NoCatch();
		System.out.println("After Exception");

	}

}
class WithoutCatch{
	public void NoCatch() throws Exception{//the method throws Exception 
		
			throw new Exception();// Here I throw my own exception
		
	}
}