import java.util.Scanner;

public class AreaPerimeter {

	public static void main(String[] args) {
		Circle objCircle = new Circle();
		Square objSquare = new Square();
		Triangle objTriangle = new Triangle();
		Cuboid objCuboid = new Cuboid();
		Sphere objSphere = new Sphere();
		objCircle.area();
		objSquare.area();
		objTriangle.area();
		objCuboid.area();
		objCuboid.volume();
		objSphere.area();
		objSphere.volume();
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
		
	}

	public void area()// overriding Interface function
	{
		System.out.println("Enter side: ");
		int side;
		Scanner sc = new Scanner(System.in);
		side = sc.nextInt();
		int area = side * side;// Calculating area
		System.out.println("Area of Square :" + area);
	}
}

class Circle implements CalcArea {
	Circle() {
		
	}

	public void area()// overriding Interface function
	{
		System.out.println("Enter radius: ");
		int radius;
		Scanner sc = new Scanner(System.in);
		radius = sc.nextInt();
		float area = ((float) (radius * radius)) * 3.14f;
		System.out.println("Area of Circle :" + area);
	}
}

class Triangle implements CalcArea {
	Triangle() {
		
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
	}
}

class Sphere implements CalcVolume, CalcArea {
	Sphere() {
	}

	public void area()// overriding Interface function
	{
		System.out.println("Enter radius: ");
		int radius;
		Scanner sc = new Scanner(System.in);
		radius = sc.nextInt();
		float area = ((float) (radius * radius)) * 3.14f;
		System.out.println("Area of sphere :" + area);

	}

	public void volume() {// overriding Interface function
		System.out.println("Enter radius: ");
		int radius;
		Scanner sc = new Scanner(System.in);
		radius = sc.nextInt();
		float volume = ((float) (radius * radius * radius) * 4 / 3) * 3.14f;
		System.out.println("Volume of Sphere :" + volume);
		
	}
}

class Cuboid implements CalcVolume, CalcArea {
	Cuboid() {
		
	}

	public void area()// overriding Interface function
	{
		System.out.println("Enter side: ");
		int side;
		Scanner sc = new Scanner(System.in);
		side = sc.nextInt();
		int area = side * side;
		System.out.println("Area of cuboid :" + area);

	}

	public void volume() {// overriding Interface function
		System.out.println("Enter side: ");
		int side;
		Scanner sc = new Scanner(System.in);
		side = sc.nextInt();
		int volume = side * side * side;
		System.out.println("Volume of cuboid :" + volume);
		

	}
}