package task3;

import java.util.Scanner;
/*
 * check alphabet or not
 */

public class MultiException {
	static int total = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Thread pass = new Thread(() -> {
			while (true) {
				Character input = sc.next().charAt(0);
				try {
					TakeAlphabets.checkAlphabetic(input);
				} catch (Exception e) {
					System.out.println("Exception: " + e.getMessage());
				} finally {
					sc.close();
				}
			}
		});
		pass.start();

	}
}

class TakeAlphabets {
	/*
	 * check whether it is alphabet or not throws Exception
	 * 
	 * @parameter gets Character input
	 * 
	 */
	synchronized public static void checkAlphabetic(Character input) throws Exception {
		if (!Character.isAlphabetic(input)) {
			throw new Exception("Input must contain only alphabetic characters. Upto the characters count is "
					+ MultiException.total);
		} else {
			++MultiException.total;
		}

	}
}
