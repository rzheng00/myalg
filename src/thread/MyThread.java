package thread;

public class MyThread implements Runnable {
	
	String name;
	Thread t;
	MyThread (String thread){
	    name = thread; 
	    t = new Thread(this, name);
		System.out.println("New thread: " + t);
		t.start();
	}
	
	public void run() {
		try {
	     for(int i = 5; i > 0; i--) {
	    	 System.out.println(name + ": " + i);
	    	 if (i%2==0) {
	    		 System.out.println("2 or 4...");
	    		 Thread.yield();
	    	 }else {
	    		 System.out.println("1 or 3 or 5...");
	    		 Thread.sleep(500);
	    	 }
	      }
		}catch (InterruptedException e) {
		     System.out.println(name + "Interrupted");
		}
		System.out.println(name + " exiting.");
	}
}
