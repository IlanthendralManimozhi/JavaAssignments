package task2package;

import java.util.Scanner;

public class RepeatedException {

	public static void main(String[] args) {
		while (true) {
			String numerator = null;
			String denominator = null;
			try {
				Scanner sc = new Scanner(System.in);
				numerator = sc.nextLine();
				if (numerator.startsWith("q")||numerator.startsWith("Q")) {
                    break;
				}
				denominator = sc.nextLine();
				int num = Integer.parseInt(numerator);
				int den = Integer.parseInt(denominator);
				int result = num / den;
				System.out.println("Result: " + result);

			} catch (Exception e) {
				System.out.println("Error: " + e.getMessage());
			}
		}
	}
}