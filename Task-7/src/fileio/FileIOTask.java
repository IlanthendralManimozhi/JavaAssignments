package fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
public class FileIOTask {
	/** 
	 * content from text.txt file are red and copied in Copy.txt file
	 * @param args not used
	 * @throws Exception
	 */
    public static void main(String[] args) throws Exception {
		final int EOF=-1;
		byte[] buff=new byte[512];
		FileInputStream in=new FileInputStream("test.txt");
		FileOutputStream out=new FileOutputStream("Copy.txt");
		int reading;
		while((reading=in.read(buff))!=EOF) {
			out.write(buff);
		}
		in.close();
		out.close();
		
	}
}
