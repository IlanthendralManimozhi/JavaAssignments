
import java.util.Scanner;
public class AreaPerimeter {

	public static void main(String[] args) {
		circle objcircle=new circle();
		square objsquare=new square();
		triangle objtriangle=new triangle();
		cuboid objcuboid=new cuboid();
		System.out.println("Enter side: ");
		sphere objsphere=new sphere();
	}

}
interface calcarea{
	public void area();
}
interface calcvolume{
	public void volume();
}
class square implements calcarea {
	square(){
		area();
	}
	public void area()
	{
		System.out.println("Enter side: ");
		int side;
		Scanner sc = new Scanner(System.in);
		side= sc.nextInt();
		int area=side*side;
	System.out.println("Area of Square :"+ area);	
	}
}
class circle implements calcarea{
	circle(){
		area();
	}
	public void area()
	{
		System.out.println("Enter radius: ");
		int radius;
		Scanner sc = new Scanner(System.in);
		radius= sc.nextInt();
		float area=((float)(radius*radius))*3.14f;
		System.out.println("Area of Circle :"+ area);	
	}
}
class triangle implements calcarea{
	triangle(){
		area();
	}
	public void area()
	{
		System.out.println("Enter base and height: ");
		int base;
		int height;
		Scanner sc = new Scanner(System.in);
		base= sc.nextInt();
		height= sc.nextInt();
		int area=base*height*1/2;
		System.out.println("Area of Triangle :"+area);	
	}
}
class sphere implements calcvolume,calcarea{
	sphere(){
		area();
		volume();
	}
	public void area()
	{
		System.out.println("Enter radius: ");
		int radius;
		Scanner sc = new Scanner(System.in);
		radius= sc.nextInt();
		float area=((float)(radius*radius))*3.14f;
		System.out.println("Area of sphere :"+ area);	
	}
	public void volume() {
		System.out.println("Enter radius: ");
		int radius;
		Scanner sc = new Scanner(System.in);
		radius= sc.nextInt();
		float volume=((float)(radius*radius*radius)*4/3)*3.14f;
		System.out.println("Volume of Sphere :" + volume);	
	}
}
class cuboid implements calcvolume,calcarea{
	cuboid(){
		area();
		volume();
	}
	public void area()
	{
		System.out.println("Enter side: ");
		int side;
		Scanner sc = new Scanner(System.in);
		side= sc.nextInt();
		int area=side*side;
	System.out.println("Area of cuboid :"+ area);	
	}
	public void volume() {
		System.out.println("Enter side: ");
		int side;
		Scanner sc = new Scanner(System.in);
		side= sc.nextInt();
		int volume=side*side*side;
		System.out.println("Volume of cuboid :" + volume);	
	}
}