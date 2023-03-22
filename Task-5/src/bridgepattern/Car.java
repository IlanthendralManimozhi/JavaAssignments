package bridgepattern;

public abstract class Car {
	protected BuildCar carBuild;

	protected Car(BuildCar carBuild) {
		this.carBuild = carBuild;// pointing current object
	}

	public abstract void build();
}