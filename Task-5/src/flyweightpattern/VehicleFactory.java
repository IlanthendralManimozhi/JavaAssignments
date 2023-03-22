package flyweightpattern;

import java.util.HashMap;

class VehicleFactory {

	private static final HashMap carMap = new HashMap();
/**
 * Method will check Car of passed color object created or not . If not it will create the object
 * @param color
 * @return car
 */
	public static Maruti getCar(String color) {
		Car car = (Car) carMap.get(color);

		if (car == null) {
			car = new Car(color);
			carMap.put(color, car);
			System.out.println("Creating Car of color : " + color);
		}
		return car;
	}
}
