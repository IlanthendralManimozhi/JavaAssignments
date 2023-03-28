package tasks;

import java.util.Scanner;

public class StringCharacterCounter {
	public static void main(String[] args) {
		String str; // the string to count words in
		Scanner sc = new Scanner(System.in);
		str = sc.nextLine();
		sc.close();
		String[] words = str.split("([\\W\\s]+)");

		System.out.println("Word count: " + words.length);
	}
}
