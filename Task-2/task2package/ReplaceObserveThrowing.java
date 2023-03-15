package task2package;

import java.io.FileReader;

public class ReplaceObserveThrowing {
	public void mth1() {
		mth2();
		System.out.println("From method -1");
	}

	public void mth2() {
		try {
			System.exit(0);//catch block finally block won't be executed jvm will be terminated.
		} catch (Exception e) {
			System.out.println("method-2");
		} finally {
			System.out.println("finally-method");
		}
	}
	

	public static void main(String[] args) {
           ReplaceObserveThrowing ot=new ReplaceObserveThrowing();
           ot.mth1();
	}

}
