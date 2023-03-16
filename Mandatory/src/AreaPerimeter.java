import java.util.Scanner;

public class AreaPerimeter {

	public static void main(String[] args) {
		Circle objCircle = new Circle();
		Square objSquare = new Square();
		Triangle objTriangle = new Triangle();
		Cuboid objCuboid = new Cuboid();
		System.out.println("Enter side: ");
		Sphere objSphere = new Sphere();
	}

}

interface CalcArea {
	public void area();
}

interface CalcVolume {
	public void volume();
}

class Square implements CalcArea {
	Square() {
		area();
	}

	public void area()// overriding Interface function
	{
		System.out.println("Enter side: ");
		int side;
		Scanner sc = new Scanner(System.in);
		side = sc.nextInt();
		int area = side * side;// Calculating area
		System.out.println("Area of Square :" + area);
		sc.close();
	}
}

class Circle implements CalcArea {
	Circle() {
		area();
	}

	public void area()// overriding Interface function
	{
		System.out.println("Enter radius: ");
		int radius;
		Scanner sc = new Scanner(System.in);
		radius = sc.nextInt();
		float area = ((float) (radius * radius)) * 3.14f;
		System.out.println("Area of Circle :" + area);
		sc.close();
	}
}

class Triangle implements CalcArea {
	Triangle() {
		area();
	}

	public void area()// overriding Interface function
	{
		System.out.println("Enter base and height: ");
		int base;
		int height;
		Scanner sc = new Scanner(System.in);
		base = sc.nextInt();
		height = sc.nextInt();
		int area = base * height * 1 / 2;
		System.out.println("Area of Triangle :" + area);
		sc.close();
	}
}

class Sphere implements CalcVolume, CalcArea {
	Sphere() {
		area();
		volume();
	}

	public void area()// overriding Interface function
	{
		System.out.println("Enter radius: ");
		int radius;
		Scanner sc = new Scanner(System.in);
		radius = sc.nextInt();
		float area = ((float) (radius * radius)) * 3.14f;
		System.out.println("Area of sphere :" + area);
		sc.close();
	}

	public void volume() {// overriding Interface function
		System.out.println("Enter radius: ");
		int radius;
		Scanner sc = new Scanner(System.in);
		radius = sc.nextInt();
		float volume = ((float) (radius * radius * radius) * 4 / 3) * 3.14f;
		System.out.println("Volume of Sphere :" + volume);
		sc.close();
	}
}

class Cuboid implements CalcVolume, CalcArea {
	Cuboid() {
		area();
		volume();
	}

	public void area()// overriding Interface function
	{
		System.out.println("Enter side: ");
		int side;
		Scanner sc = new Scanner(System.in);
		side = sc.nextInt();
		int area = side * side;
		System.out.println("Area of cuboid :" + area);
		sc.close();
	}

	public void volume() {// overriding Interface function
		System.out.println("Enter side: ");
		int side;
		Scanner sc = new Scanner(System.in);
		side = sc.nextInt();
		int volume = side * side * side;
		System.out.println("Volume of cuboid :" + volume);
		sc.close();

	}
}