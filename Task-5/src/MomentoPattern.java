import java.util.ArrayList;
import java.util.List;
/**
 * Momento Pattern stores the object states and it can retrieved when it is needed
 * @author ilanthendralmanimozhi
 *
 */
class Memento {
	private String state;
/**
 * storing the current state 
 * @param state
 */
	public Memento(String state) {
		this.state = state;
	}

	public String getTime() {
		return state;
	}
}

class TimeStock {
	private List<Memento> mementoList = new ArrayList<Memento>();
/**
 * add current state to the momentoList
 * @param state
 */
	public void add(Memento state) {
		mementoList.add(state);
	}
/**
 * retrieving from the List
 * @param index
 * @return Momento object
 */
	public Memento get(int index) {
		return mementoList.get(index);
	}
}

class MomentoCreater {
	private String state;

	public void setTime(String state) {
		this.state = state;
	}

	public String getTime() {
		return state;
	}

	public Memento saveCurrentTime() {
		return new Memento(state);
	}

	public void TimeTravel(Memento memento) {
		state = memento.getTime();
	}
}

public class MomentoPattern {
	/**
	 * Implementing momento pattern
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

		momentoCreater.TimeTravel(timeStock.get(0));
		System.out.println("Travel back to first age: " + momentoCreater.getTime());
		momentoCreater.TimeTravel(timeStock.get(1));
		System.out.println("Travel back to second age : " + momentoCreater.getTime());
	}
}
