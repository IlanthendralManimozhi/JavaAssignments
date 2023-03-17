package task3;
/*
 * The class calls the same thread twice which will throws the exception IllegalThreadState Exception
 */
public class AgainThread {
	/*
	 * @parameter args not used
	 * @return nothing
	 */
	public static void main(String[] args) {
		Thread t = new Thread(() -> {
		   
		        System.out.println("Hey it's me...");
		    
		});

		t.start(); // start the thread



		t.start(); // start the new thread
	
	}
}