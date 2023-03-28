package flyweightpattern;

import java.util.Scanner;

/**
 * Implementation Flyweight Pattern
 * @author ilanthendralmanimozhi
 *
 */
/**
 * Implementation Flyweight Pattern
 * 
 * @author ilanthendralmanimozhi
 *
 */
public class FlyWeightPattern {
	private static final String colors[] = { "Red", "Grey", "Blue", "White", "Black" };

	/**
	 * Method create object for specified color for first time the same used again
	 * and again
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		for (int i = 0; i < colors.length; i++) {
			System.out.println("Enter " + i + " for " + colors[i] + " car");
		}
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 20; ++i) {
			int color;
			try {
				color = sc.nextInt();
				if (color > 4) {
					throw new InvalidChoiceException("Invalid Choice choosed option doesn't exist");
				} else {
					Car circle = (Car) VehicleFactory.getCar(getColor(color));
					circle.build();
				}
			} catch (InvalidChoiceException e) {
				e.printStackTrace();
			}

		}
	}

	private static String getColor(int option) {
		return colors[option];
	}

}
