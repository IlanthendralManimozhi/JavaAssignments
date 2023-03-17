package task3;
/*
 * Contain three Threads 
 */
public class ThreadWithBuffer {
	public static void main(String[] args) throws Exception {
SharedObject sharedObject = new SharedObject();
        
        MyThread thread1 = new MyThread(sharedObject);
        MyThread thread2 = new MyThread(sharedObject);
        MyThread thread3 = new MyThread(sharedObject);
        
        thread1.start();
        thread2.start();
        thread3.start();
        
	}

}
 class SharedObject {
	 char character='A';
	 StringBuffer sb = new StringBuffer(character);
	 /**
	  * print every alphabet 100 times
	  */
    public synchronized void increment() {
    	for(int i=0;i<100;i++) {
    		sb.append(character);
    	}
    	System.out.println(sb);
    	sb.delete(0,100); 
        ++character;
    }
}

class MyThread extends Thread {
    private SharedObject sharedObject;
    /*
     * same object for all three thread
     */
    public MyThread(SharedObject sharedObject) {
        this.sharedObject = sharedObject;
    }
    
    @Override
    public void run() {
        for (int i = 0; i <26; i++) {
            sharedObject.increment();

        }
    }
}