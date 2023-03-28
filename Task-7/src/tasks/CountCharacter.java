package tasks;

import java.io.IOException;

public class CountCharacter {
    public static void main(String[] args) {
        int count = 0;  // initialize character count to zero

        // loop over standard input
        try {
            while (true) {
                int c = System.in.read();  // read a character from standard input
                if (c == -1) {  // exit loop when the user enters Ctrl + Z
                    break;
                }
                count++;  // increment character count
            }
        } catch (IOException e) {
            System.err.println("Error reading input: " + e.getMessage());
            System.exit(1);
        }

        System.out.println("Character count: " + count);
    }
}
