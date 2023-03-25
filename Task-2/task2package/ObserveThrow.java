package task2package;
import java.io.*;
public class ObserveThrow {
	public void mth1() {
		mth2();
		System.out.println("From method -1");
	}

	public void mth2() {
		try {
			FileReader fileReader = new FileReader("Test.txt");//return won't executed it goes to catch block and execute catch.
			return;
		} catch (Exception e) {
			System.out.println("method-2");
		} finally {
			System.out.println("finally-method");//at last finally will execute.
		}
	}
	

	public static void main(String[] args) {
           ObserveThrow ot=new ObserveThrow();
           ot.mth1();
	}

}
