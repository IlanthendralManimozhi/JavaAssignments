package task3;

/*
 * 
 * Create thread counter which prints out for every 10 seconds
 * 
 */
public class CountingThread {
	static int count;

	/*
	 * Counts up to 100 for every second and print for every 10 seconds
	 */
	public static void main(String[] args) {
		Thread counter = new Thread(() -> {
			while (count <= 100) {
				try {
					++count;
					if ((count % 10) == 0) {
						System.out.println("Ten counted");
					}
					System.out.println(count);
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		counter.start();
	}

}
