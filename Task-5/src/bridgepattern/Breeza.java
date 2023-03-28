package bridgepattern;

public class Breeza implements BuildCar{
	/**
	 * Override the carBuilder method of the BuildCar interface to create a
	 * specific implementation for the Breeza car model.
	 */
	public void carBuilder() {
		// Print out the specifications of the Breeza car model
		System.out.println("Here the car with the capacity of 27kmpl Price is 10.45L");
	}
}
