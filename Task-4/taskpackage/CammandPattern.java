package taskpackage;
import java.util.Scanner;
/**
 * CammandPattern Implementation
 * @author ilanthendralmanimozhi
 *
 */
public class CammandPattern {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Remote remote=new Remote();
		int channel;
		remote.setCommand(1, new NewsCommand());
		remote.setCommand(2, new SerialCommand());
		remote.setCommand(3, new Discovery());
		remote.setCommand(4, new Cartoon());
		System.out.println("Enter the command number");
		channel=sc.nextInt();
		remote.executeCommand(channel);
		sc.close();
	}
}
class Remote{
	Command c[]=new Command[5];
	
	public Remote() {
		for(int i=0;i<c.length;i++) {
			c[i]=new Command() {				
				@Override
				public void execute() {
					System.out.println("I am dummy yet to be operational....");
				}
			};
		}
	}
	/**
	 * method execute specific command associated with it
	 * @param slot
	 */
	public void executeCommand(int slot) {
		c[slot].execute();
	}
	/**
	 * alotting slots to specified object
	 * @param slot
	 * @param cc assigned to particular slots
	 */
	public void setCommand(int slot,Command cc) {
		c[slot]=cc;// setting slots for function
	}
}
abstract class Command{

	public abstract void execute();
}
class NewsCommand extends Command{
	
	
	@Override
	public void execute() {
		System.out.println("news command initiated....");
		System.out.println("news channel started....");
	}
}
class SerialCommand extends Command{
	
	@Override
	public void execute() {
		System.out.println("serial command initiated....");
		
		System.out.println("serial channel started....");
	}
}
class Discovery extends Command{
	
	@Override
	public void execute() {
		System.out.println("Discovery command initiated....");
		
		System.out.println("Discovery game started....");
	}
}
class Cartoon extends Command{
	
	
	@Override
	public void execute() {
		System.out.println("Cartoon command initiated....");
		System.out.println("Cartoon  started....");
	}
}







