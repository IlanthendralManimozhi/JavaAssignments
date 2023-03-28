import java.io.BufferedInputStream;
import java.io.FileInputStream;
public class BufferedInputStreamTask { 
	/**
	 * content from text.txt file are red by BufferedInputStream 
	 * @param args not used
	 */
	 public static void main(String args[]){    
		  try{    
		    FileInputStream fin=new FileInputStream("test.txt");    
		    BufferedInputStream bin=new BufferedInputStream(fin);    
		    int i;    
		    while((i=bin.read())!=-1){    
		     System.out.print((char)i);    
		    }    
		    bin.close();    
		    fin.close();    
		  }catch(Exception e){System.out.println(e);}    
		 }    
		}  