package task2package;

import java.util.Scanner;

public class HandlingAvg  {
	//made this variable static in-order to make changes in same variable and to use inside static methods
	static int students[] = new int[10];//To store marks in array
	static int iterator=0;// To iterate through student array
	static int sum=0;
    public static void average(int  index)throws Exception {//get input handle exception simultaneously.
    	try {
    	for (int i = index; i < students.length; i++ ,iterator++) {
			System.out.println("Student" + (i + 1) + " mark:");
			Scanner sc=new Scanner(System.in);
			students[i] = sc.nextInt();
			sum = sum + students[i];
			if (students[i] < 0) {
				throw new Exception("Invalid input");
			}
    	}
    	}catch (Exception e){
    		System.out.println("Error: " + e.getMessage());
			System.out.println("Enter Valid mark: ");
			average(iterator);	//to continue the left iteration.	
    	}
    }
	public static void main(String[] args) throws Exception{
		
			average(iterator);	// Initiating the process
			System.out.println("Results:" + sum / students.length);//Calculating average.
	}

}
