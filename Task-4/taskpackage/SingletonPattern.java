package taskpackage;

public class SingletonPattern {
	/**
	 * Main creates  two threads try to access the same class through creating object of the class
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				MySingleTon.createInstance();
				
			}
		}).start();
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				MySingleTon.createInstance();
				
			}
		}).start();
	}
}
class MySingleTon{
	private MySingleTon() {
		System.out.println("singleton object created...");
	}
	private static MySingleTon obj;
	/**
	 * The method creates object if no other object created for the class
	 * @return MysingleTon type object 
	 */
	synchronized public static MySingleTon createInstance() {
		if(obj==null) {
			obj=new MySingleTon();
		}
		return obj;
	}
}