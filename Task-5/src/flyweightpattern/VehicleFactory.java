package flyweightpattern;

import java.util.HashMap;

class VehicleFactory {

    private static final HashMap<String, Maruti> carMap = new HashMap<>();

    /**
     * This method checks if a car object of the specified color has been created before. 
     * If not, it creates the object and adds it to the carMap.
     * 
     * @param color the color of the car object to be created
     * @return a car object of the specified color
     */
    public static Maruti getCar(String color) {
        Maruti car = carMap.get(color);

        if (car == null) {
            car = new Car(color);
            carMap.put(color, car);
            System.out.println("Creating Car of color : " + color);
        }
        return car;
    }
}
