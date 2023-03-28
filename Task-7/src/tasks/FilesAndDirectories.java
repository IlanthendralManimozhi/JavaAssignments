package tasks;

import java.io.File;

public class FilesAndDirectories {

	public static void main(String[] args) {
		if (args.length == 1) {
			String path = args[0];
			File directory = new File(path);
			if (directory.isDirectory()) {
				System.out.println("Listing all files and directories in " + path);
				String[] files = directory.list();
				for (String filename : files) {
					System.out.println(filename);
				}
			} else {
				System.out.println(path + " is not a valid directory.");
			}
		} else {
			System.out.println("Usage: java ListFiles <directory>");
		}
	}
}
