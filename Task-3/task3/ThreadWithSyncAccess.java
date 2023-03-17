/**
 * 
 */
package task3;

import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ilanthendralmanimozhi
 *
 */
public class ThreadWithSyncAccess {

	/**
	 * @param args not used
	 * 
	 */
	public static void main(String[] args) {

		ExecutorService poolOfThread = Executors.newFixedThreadPool(20);// creating thread pool
		poolOfThread.execute(() -> {
			displayMessage(new Thread().getName());
			System.out.println("Hi, this is Thread-01");
		});
		poolOfThread.execute(() -> {
			displayMessage(new Thread().getName());
			System.out.println("Hi, this is Thread-02");
		});
		poolOfThread.execute(() -> {
			displayMessage(new Thread().getName());
			System.out.println("Hi, this is Thread-03");
		});
		poolOfThread.execute(() -> {
			displayMessage(new Thread().getName());
			System.out.println("Hi, this is Thread-04");
		});
		poolOfThread.execute(() -> {
			displayMessage(new Thread().getName());
			System.out.println("Hi, this is Thread-05");
		});
		poolOfThread.execute(() -> {
			displayMessage(new Thread().getName());
			System.out.println("Hi, this is Thread-06");
		});
		poolOfThread.execute(() -> {
			displayMessage(new Thread().getName());
			System.out.println("Hi, this is Thread-07");
		});
		poolOfThread.execute(() -> {
			displayMessage(new Thread().getName());
			System.out.println("Hi, this is Thread-08");
		});
		poolOfThread.execute(() -> {
			displayMessage(new Thread().getName());
			System.out.println("Hi, this is Thread-09");
		});

	}

	/*
	 * function called with multiple threads. since it is synchronized it can be
	 * accessed one at a time.
	 * made synchronized so one thread can access at a time.
	 * 
	 */
	synchronized public static void displayMessage(String name) {
		System.out.println("[---------" + name + "---------]");
	}

}
