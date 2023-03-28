package flyweightpattern;

public class Car implements Maruti {
    private String color;

    // Constructor of Car class which takes the color of the car as a parameter.
    public Car(String color) {
        this.color = color;
    }

    /**
     * Implementing the 'build' method of the 'Maruti' interface.
     * This method is used to build the car of the specified color.
     */
    @Override
    public void build() {
        System.out.println("Car of Color: " + color + " Built");
    }
}
