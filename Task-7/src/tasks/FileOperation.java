package tasks;

import java.io.File;

public class FileOperation {
	public static void main(String[] args) {
		File file = new File("test.txt"); // create a File object for the file "test.txt"

		// check if the file exists and is a regular file
		if (file.exists() && file.isFile()) {
			long size = file.length(); // get the size of the file in bytes
			System.out.println("File size: " + size + " bytes");

			boolean deleted = file.delete(); // delete the file
			if (deleted) {
				System.out.println("File deleted successfully");
			} else {
				System.out.println("Failed to delete file");
			}

			File newFile = new File("testCopy.txt"); // create a new File object for the new file name
			boolean renamed = file.renameTo(newFile); // rename the file
			if (renamed) {
				System.out.println("File renamed successfully");
			} else {
				System.out.println("Failed to rename file");
			}
		} else {
			System.out.println("File not found or is not a regular file");
		}
	}
}
