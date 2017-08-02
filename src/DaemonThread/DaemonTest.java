package DaemonThread;

/**
 * Daemon thread is a service provider thread.

 * It provides services to user threads for background supporting tasks. 
 * It is a low priority thread.  
 * @author Hp
 *
 */



/*
 *As mention in the assignment ,
 *Creates a class DaemonTest and extend this class With Runnable Interface.
*/
public class DaemonTest implements Runnable { 

	@Override
	public void run() { //Creating Run method 
		
		/**
		 * Creating if else statement .
		 * if,
		 *  current thread is found to be daemon than it will print "Daemon thread start " .
		 * else ,
		 * it will print  "Thread start".
		 */

		if (Thread.currentThread().isDaemon()) {  
			System.out.println("Daemon thread start\n"); //Prints message when daemon thread start.
		} else {
			System.out.println("Thread start"); //Prints message when user thread start.
		}
	}

	public static void main(String[] args) { //Main Method
		Thread thread1 = new Thread(new DaemonTest()); // Creating thread 1 object
		Thread thread2 = new Thread(new DaemonTest()); // Creating thread 2 object
		 thread1.setDaemon(true); //Assigning the thread1 to daemon thread 

		thread1.start(); //Thread 1 starts executing 
		thread2.start(); //Thread 2 starts executing

	}

}
