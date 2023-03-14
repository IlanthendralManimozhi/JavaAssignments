import java.util.Scanner;

public class MarkSheet {

	public static void main(String[] args) {
		Results S1=new Results();
		Scanner sc=new Scanner(System.in); 
		S1.name=sc.nextLine(); 
		S1.rollno=sc.nextLine(); 
		S1.sub1=sc.nextInt(); 
		S1.sub2=sc.nextInt(); 
		S1.sub3=sc.nextInt();
		System.out.println("Total:" + S1.totalmark());

	}

}
class Student{
	
	String name, rollno;

}
 class Exam extends Student{
      int sub1,sub2,sub3;
	
}
class Results extends Exam{
	int totalmark;
	public int totalmark() {
		totalmark=sub1+sub2+sub3;
		return totalmark;
	}
}