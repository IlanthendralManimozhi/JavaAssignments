package bridgepattern;

/**
 * Define a concrete class for a Vitara car that implements the BuildCar
 * interface and provides its own implementation for the carBuilder() method
 * 
 */
public class Vitara implements BuildCar {
	/**
	 * Override the carBuilder method of the BuildCar interface to create a specific
	 * implementation for the Vitara car model.
	 */
	public void carBuilder() {
		System.out.println("Here the car with the capacity 25kmpl of Price is 8.18L");
	}
}