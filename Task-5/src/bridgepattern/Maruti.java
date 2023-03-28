package bridgepattern;

/**
 * Define a concrete class for a Maruti car that extends the abstract Car class
 * and implements the build() method by calling the carBuild.carBuilder() method
 */
public class Maruti extends Car {

	public Maruti(BuildCar carBuild) {
		super(carBuild);

	}

	@Override
	public void build() {
		carBuild.carBuilder();
	}
}