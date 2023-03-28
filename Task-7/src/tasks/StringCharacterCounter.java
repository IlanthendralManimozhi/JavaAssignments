package tasks;

import java.util.Scanner;

public class StringCharacterCounter {
	public static void main(String[] args) {
		String str; // the string to count words in
		Scanner sc = new Scanner(System.in);
		int count = 0; // initialize word count to zero
        str=sc.nextLine();
        sc.close();
		// loop over the string
		for (int i = 0; i < str.length(); i++) {
			// check if the current character is a whitespace or the last character in the
			// string
			if (Character.isWhitespace(str.charAt(i)) || i == str.length() - 1) {
				count++; // increment word count
			}
		}

		System.out.println("Word count: " + count);
	}
}
