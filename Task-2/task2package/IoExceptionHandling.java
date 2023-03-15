package task2package;
import java.io.*;
public class IoExceptionHandling {

	public static void main(String[] args) {
		//read file which is not present which throws IOException
		FileReader fileReader = new FileReader("Test.txt");

	    System.out.println(fileReader.read());

	    fileReader.close();
	}

}
