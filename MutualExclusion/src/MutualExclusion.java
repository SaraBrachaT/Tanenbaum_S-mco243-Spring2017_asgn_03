
public class MutualExclusion{

	public static boolean t1WantsToEnter = false;
	public static boolean t2WantsToEnter = false;
	public static boolean done = false;
	public static int favoredThread = 1;
	
	
	
	public static void main(String[] args) throws InterruptedException {
		
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
		t1.start();
		t2.start();
	}

}
