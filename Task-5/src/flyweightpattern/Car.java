package flyweightpattern;

public class Car implements Maruti {
	private String color;

	public Car(String color) {
		this.color = color;
	}
/**
 * Build the car of specified color.
 */
	@Override
	public void build() {
		System.out.println("Circle: Draw() [Color : " + color + "]");
	}
}
