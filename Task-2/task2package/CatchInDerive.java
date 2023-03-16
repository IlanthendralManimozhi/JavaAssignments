package task2package;
public class CatchInDerive {
    public static void main(String[] args) {
        Derived D = new Derived();
    }
}

class Base {
    Base() {
        throw new RuntimeException("Base constructor error");
    }
}

class Derived extends Base {//Bass class constructor executed when derived class object created so, it cannot caught in derived class
    Derived() {
        try {
        	super();  //should be first statement of constructor so it won't work
            // Other statements here
        } catch (RuntimeException ex) {
            System.out.println("Caught exception in Derived constructor: " + ex.getMessage());
        }
    }
}