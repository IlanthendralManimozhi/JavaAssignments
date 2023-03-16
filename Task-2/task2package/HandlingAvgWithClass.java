package task2package;
import java.util.Scanner;

public class HandlingAvgWithClass  {
	//made this variable static in-order to make changes in same variable and to use inside static methods
	static int students[] = new int[10];//To store marks in array
	static int iterator=0;// To iterate through student array
	static int sum=0;
    public static void average(int  index)throws Exception {
    	Scanner sc=new Scanner(System.in);
    	try {
    	for (int i = index; i < students.length; i++ ,iterator++) {//get input handle exception simultaneously.
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
			average(iterator);		//to continue the left iteration.	
    	}
    }
	public static void main(String[] args) throws Exception{
		
			average(iterator);		// Initiating the process
			System.out.println("Results:" + sum / students.length);//Calculating average.
	}

}
class RangeException extends Exception{
	//created Exception classes to throw exception for out of range either less than zero or greater than 100.
public String printTraceback() {
	return "Out of Range";
	
}
}