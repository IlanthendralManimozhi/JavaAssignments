package bridgepattern;

public class Maruti extends Car {

	public Maruti(BuildCar carBuild) {
		super(carBuild);

	}

	@Override
	public void build() {
		carBuild.buildcar();
	}
}