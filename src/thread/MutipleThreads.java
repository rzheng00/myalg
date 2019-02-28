package thread;

public class MutipleThreads {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread one = new MyThread("One");
	    MyThread two = new MyThread("Two");
	    MyThread three = new MyThread("Three");
	    System.out.println("calling Thread.run() directly....");
	    one.run();
	    two.run();
	    three.run();
		try {
		    Thread.sleep(10000);
		} catch (InterruptedException e) {
		    System.out.println("Main thread Interrupted");
		}
		System.out.println("Main thread exiting.");
	}

}
