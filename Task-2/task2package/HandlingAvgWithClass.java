package task2package;
import java.util.Scanner;

public class HandlingAvgWithClass  {
	static int students[] = new int[10];
	static int iterator=0;
	static int sum=0;
    public static void average(int  index)throws Exception {
    	Scanner sc=new Scanner(System.in);
    	try {
    	for (int i = index; i < students.length; i++ ,iterator++) {
			System.out.println("Student" + (i + 1) + " mark:");
			students[i] = sc.nextInt();
			sum = sum + students[i];
			if (students[i] < 0 || students[i]>100) {
				throw new RangeException();
			}
    	}
    	}catch (RangeException e){
    		System.out.println("Error: " + e.printTraceback());
			System.out.println("Enter Validmark: ");
			average(iterator);		
    	}
    }
	public static void main(String[] args) throws Exception{
		
			average(iterator);	
			System.out.println("Results:" + sum / students.length);
	}

}
class RangeException extends Exception{
public String printTraceback() {
	return "Out of Range";
	
}
}