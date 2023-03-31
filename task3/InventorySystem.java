/**
 * 
 */
package task3;

/**
 * @author ilanthendralmanimozhi
 *
 */
public class InventorySystem {
	static int stock = 0;
	static boolean isProduced = false;
	static int iterater = 9;

	/**
	 * contain three threads which is going to with communicate each other .
	 * 
	 * @param args not used
	 * 
	 */
	public static void main(String[] args) {

		// perform increment in stock
		Thread producer1 = new Thread(() -> {
			while (iterater != 0) {
				--iterater;
				synchronized (InventorySystem.class) {
					while (isProduced || stock >= 1) {
						try {
							InventorySystem.class.wait();// for communicate with other threads
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					int product = 1;
					stock += product;
					isProduced = true;
					System.out.println("Producer 1 produced item " + product);
					InventorySystem.class.notifyAll();
				}
			}
		});
		// perform increment in stock
		Thread producer2 = new Thread(() -> {
			while (iterater != 0) {
				--iterater;
				synchronized (InventorySystem.class) {
					while (isProduced || stock >= 1) {
						try {
							InventorySystem.class.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					int product = 1;
					stock += product;
					isProduced = true;
					System.out.println("Producer 2 produced item " + product);
					InventorySystem.class.notifyAll(); // for communicate with other threads
				}
			}
		});
//perform decrement in stock
		Thread consumer = new Thread(() -> {
			while (iterater != 0) {
				--iterater;
				synchronized (InventorySystem.class) {
					while (!isProduced || stock <= 0) {
						try {
							InventorySystem.class.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println("Consumer consumed item " + stock);
					stock = 0;
					isProduced = false;
					InventorySystem.class.notifyAll(); // for communicate with other threads
				}
			}
		});

		producer1.start();
		producer2.start();
		consumer.start();

	}

}