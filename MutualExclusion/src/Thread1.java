
public class Thread1 extends Thread{

	public void run()
	{
		while (!MutualExclusion.done) {
			MutualExclusion.t1WantsToEnter = true;
			while (MutualExclusion.favoredThread == 2) {
				while (MutualExclusion.t2WantsToEnter)
					try {
						Thread1.sleep((long) .5);
					} catch (InterruptedException e) {
						System.out.println(e.getMessage());
					}
				MutualExclusion.favoredThread = 1;
			}
			System.out.println("t1 entering critical code");
			MutualExclusion.t1WantsToEnter = false;
			System.out.println("t1 exiting critical code");
		}

	}
}
