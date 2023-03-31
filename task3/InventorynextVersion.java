package task3;

/**
 * 
 * @author ilanthendralmanimozhi
 *
 */
public class InventorynextVersion {
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
		InventorynextVersion obj = new InventorynextVersion();
		Thread producer1 = new Thread(() -> {
			while (iterater != 0) {
				--iterater;
				obj.performAction(true);
			}
		});
		Thread producer2 = new Thread(() -> {
			while (iterater != 0) {
				--iterater;
				obj.performAction(true);
			}
		});
		Thread consumer = new Thread(() -> {
			while (iterater != 0) {
				--iterater;
				obj.performAction(false);
			}
		});

		producer1.start();
		producer2.start();
		consumer.start();
	}

	/**
	 * Based on thread access the method perform addition and reduction from the
	 * stock
	 * 
	 * @param isProducer check whether the required stock present or not
	 */
	public synchronized void performAction(boolean isProducer) {
		try {
			if (isProducer) {
				while (isProduced || stock >= 1) {
					wait();
				}
				int product = 1;
				stock += product;
				isProduced = true;
				System.out.println(Thread.currentThread().getName() + " produced item " + product);
				notifyAll();
			} else {
				while (!isProduced || stock <= 0) {
					wait();
				}
				System.out.println(Thread.currentThread().getName() + " consumed item " + stock);
				stock = 0;
				isProduced = false;
				notifyAll();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
