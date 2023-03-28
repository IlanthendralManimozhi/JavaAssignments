package sequentialinput;

import java.io.SequenceInputStream;
import java.io.FileInputStream;
import java.util.Vector;
public class SequentialInputStreamTask {
	/**
	 * Content from the both text files and testCopy.txt printed in sequential manner.
	 * @param args
	 * @throws Exception
	 */
	 public static void main(String args[])throws Exception{    
		   FileInputStream input1=new FileInputStream("test.txt");    
		   FileInputStream input2=new FileInputStream("testCopy.txt");    
		   SequenceInputStream inst=new SequenceInputStream(input1, input2);    
		   int j;    
		   while((j=inst.read())!=-1){    
		    System.out.print((char)j);    
		   }    
		   inst.close();    
		   input1.close();    
		   input2.close();    
		  }    
}
