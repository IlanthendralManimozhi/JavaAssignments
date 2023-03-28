package momento;

import java.util.ArrayList;
import java.util.List;

/**
 * This class represents the Memento pattern, which stores the state of an
 * object and allows it to be retrieved when needed. It contains two
 * sub-classes: Momento and TimeStock.
 * 
 * @author ilanthendralmanimozhi
 *
 */
class Momento {
	final private String state;

	/**
	 * Constructor that stores the current state of the object
	 * 
	 * @param state The current state of the object
	 *
	 */
	public Momento(String state) {
		this.state = state;
	}

	public String getState() {
		return state;
	}
}

/**
 * 
 * This class represents a stock of moments in time.
 * 
 * It stores the Momento objects and allows them to be retrieved later.
 *
 */
class TimeStock {
	private List<Momento> mementoList = new ArrayList<Momento>();

	/**
	 * Method to add a Momento object to the list
	 * 
	 * @param state The Momento object to be added
	 * 
	 */
	public void add(Momento state) {
		mementoList.add(state);
	}

	/**
	 * Method to retrieve a Momento object from the list
	 * 
	 * @param index The index of the Momento object to be retrieved
	 * @return The Momento object at the specified index
	 */
	public Momento get(int index) {
		try {
			if (index < 0) {
				throw new InvalidTimeException("Invalid Time");
			}
		} catch (InvalidTimeException e) {
			e.printStackTrace();
		}
		return mementoList.get(index);
	}
}

/**
 * This class represents the creator of the Memento objects.
 * 
 * It allows the state of an object to be saved and retrieved.
 *
 * 
 */
class MomentoCreater {
	private String state;

	/**
	 * 
	 * Setter method for the state variable
	 * 
	 * @param state The new state of the object
	 */
	public void setTime(String state) {
		this.state = state;
	}

	/**
	 * 
	 * Getter method for the state variable
	 * 
	 * @return The state of the object
	 */
	public String getTime() {
		return state;
	}

	/**
	 * 
	 * Method to create a new Momento object and store the current state of the
	 * object in it
	 * 
	 * @return The newly created Momento object
	 */
	public Momento saveCurrentTime() {
		return new Momento(state);
	}

	/**
	 * Method to retrieve the state of the object from a Momento object and set it
	 * as the current state
	 * 
	 * @param memento The Momento object to retrieve the state from
	 */
	public void retriveMomento(Momento memento) {
		state = memento.getState();
	}
}

/**
 * This class demonstrates the use of the Memento pattern by creating a
 * MomentoCreater object, storing its states in Momento objects in a TimeStock
 * object, and retrieving them.
 *
 */

public class MomentoPattern {
	/**
	 * Implementing momento pattern
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {

		MomentoCreater momentoCreater = new MomentoCreater();
		TimeStock timeStock = new TimeStock();

		momentoCreater.setTime("Stone age");
		timeStock.add(momentoCreater.saveCurrentTime());

		momentoCreater.setTime("Ice age");
		timeStock.add(momentoCreater.saveCurrentTime());

		momentoCreater.setTime("Computer age");
		System.out.println("Current State: " + momentoCreater.getTime());

		momentoCreater.retriveMomento(timeStock.get(0));
		System.out.println("Travel back to first age: " + momentoCreater.getTime());
		momentoCreater.retriveMomento(timeStock.get(1));
		System.out.println("Travel back to second age : " + momentoCreater.getTime());
	}
}
