package taskpackage;
/**
 * create object for shape and calculating the area
 * @author ilanthendralmanimozhi
 *
 */
public class Visitorspattern {
	public static void main(String[] args) {
		Shape shapes =new Circle(5);
		AreaVisitor areaVisitor = new AreaVisitor();
		    shapes.accept(areaVisitor);
		System.out.println("Total area: " + areaVisitor.getTotalArea());

	}

}
interface Shape {
    void accept(Visitor visitor);
}

class Circle implements Shape {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

class Rectangle implements Shape {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
interface Visitor {
    void visit(Circle circle);
    void visit(Rectangle rectangle);
}
/**
 * 
 * Based on the object passed overloading will haven
 *
 */
class AreaVisitor implements Visitor {
    private double totalArea = 0;

    public double getTotalArea() {
        return totalArea;
    }
    /**
     * Calculating area of circle
     * @param shape object
     */

    public void visit(Circle circle) {
        totalArea += Math.PI * circle.getRadius() * circle.getRadius();
    }
    /**
     * Calculating area of rectangle
     * @param shape object
     */

    public void visit(Rectangle rectangle) {
        totalArea += rectangle.getWidth() * rectangle.getHeight();
    }
}
