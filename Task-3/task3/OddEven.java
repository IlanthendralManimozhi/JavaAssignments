/**
 * 
 */
package task3;

import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author ilanthendralmanimozhi Performs Multithreading in finding odd or even
 *         number
 */
public class OddEven {

	/**
	 * @param args does not perform any function
	 */
	public static void main(String[] args) {
		PerformDetection performDetection = new PerformDetection();
		Scanner sc = new Scanner(System.in);
		int startNumber = sc.nextInt();
		int endNumber = sc.nextInt();
		ExecutorService poolOfThread = Executors.newFixedThreadPool(2);//creating the thread pool.
		poolOfThread.execute(() -> {
			performDetection.even(startNumber, endNumber);
		});
		poolOfThread.execute(() -> {
			performDetection.odd(startNumber, endNumber);
		});
		poolOfThread.shutdown();
	}

}

class PerformDetection {
	/**
	 * function find the odd number
	 * 
	 * @param from starting number of range
	 * @param to   ending number of range
	 */
	public void odd(int from, int to) {
		for (int i = from; i <= to; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}

	}

	/**
	 * function to find the even number
	 * 
	 * @param from starting number of range
	 * @param to   ending number of range
	 */
	public void even(int from, int to) {
		for (int i = from; i <= to; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

	}
}