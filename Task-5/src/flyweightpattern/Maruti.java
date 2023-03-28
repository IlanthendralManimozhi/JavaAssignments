package flyweightpattern;

/**
 * This interface is used in the Flyweight Pattern implementation to define the
 * common methods that all car objects must implement.
 * 
 * In this code, the interface contains only one method named "build". This
 * method is used to build the car of the specified color.
 * 
 * 
 */
public interface Maruti {
	/**
	 * This method is used to build the car of the specified color.
	 */
	public void build();
}
