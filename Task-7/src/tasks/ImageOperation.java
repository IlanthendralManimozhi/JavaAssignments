package tasks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ImageOperation {
	public static void main(String[] args) {
		// Open the input and output image files in binary mode
		try (FileInputStream input = new FileInputStream("chairs.png");
				FileOutputStream output = new FileOutputStream("output_image.png")) {

			// Read one byte at a time from the input file and write it to the output file
			int byteValue;
			while ((byteValue = input.read()) != -1) {
				output.write(byteValue);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
