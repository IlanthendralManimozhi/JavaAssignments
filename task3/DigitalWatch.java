package task3;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * Display current time for every second
 */
public class DigitalWatch {
	/*
	 * Display current time for every second
	 * 
	 * @parameter args not used
	 * 
	 * @return nothing
	 */
	public static void main(String[] args) {
		Thread time = new Thread(() -> {
			while (true) {
				try {
					SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
					Date d = new Date();
					System.out.print("\r" + sdf.format(d));
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		time.start();
	}
}