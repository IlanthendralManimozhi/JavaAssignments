package task2package;

import java.util.Scanner;

public class RepeatedException {

	public static void main(String[] args) {
		while (true) {
			// getting input as string in-order to verify the condition whether it is q or Q.
			String numerator = null;
			String denominator = null;
			try {
				Scanner sc = new Scanner(System.in);
				numerator = sc.nextLine();
				if (numerator.startsWith("q")||numerator.startsWith("Q")) {
                    break;//breaking the loop if condition is true.
				}
				denominator = sc.nextLine();
				//converting it to integer to do the division operation.
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