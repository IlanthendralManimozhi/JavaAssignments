package tasks;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
 
class ConsoleWriter
{
    public static void main(String[] args)
    {
        File file = new File("test.txt");
        
        try 
        {
        	FileReader fr = new FileReader(file);
            int content;
            while ((content = fr.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}