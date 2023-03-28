package bridgepattern;
/**
 * Define an abstract class for a Car that takes a BuildCar object in its constructor 
 * and has an abstract build() method
 *
 */
public abstract class Car {
	protected BuildCar carBuild;

	protected Car(BuildCar carBuild) {
		this.carBuild = carBuild;// pointing current object
	}

	public abstract void build();
}