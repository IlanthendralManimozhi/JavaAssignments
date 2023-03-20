import java.util.Scanner;

public class MarkSheet {

	public static void main(String[] args) {
		Results student1 = new Results();
		Scanner sc = new Scanner(System.in);
		student1.name = sc.nextLine();// getting student name
		student1.rollno = sc.nextLine();// roll-number
		// getting marks
		student1.sub1 = sc.nextInt();
		student1.sub2 = sc.nextInt();
		student1.sub3 = sc.nextInt();
		System.out.println("Total:" + student1.totalmark());
		sc.close();
	}

}

class Student {

	String name, rollno;

}

class Exam extends Student {
	int sub1, sub2, sub3;

}

class Results extends Exam {
	int totalmark;

	public int totalmark() {
		totalmark = sub1 + sub2 + sub3;
		return totalmark;
	}
}