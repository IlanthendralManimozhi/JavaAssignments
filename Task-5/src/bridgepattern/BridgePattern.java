package bridgepattern;

public class BridgePattern {

	/**
	 * Define the BridgePattern class with a main() method that creates two Maruti
	 * car objects with different BuildCar implementations and calls the build()
	 * method on each object
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		// Create a new Maruti object with a Breeza implementation
		Car breeza = new Maruti(new Breeza());
		// Create a new Maruti object with a Vitara implementation
		Car vitara = new Maruti(new Vitara());

		// Call the build method on the breeza object
		breeza.build();
		// Call the build method on the vitara object
		vitara.build();
	}
}