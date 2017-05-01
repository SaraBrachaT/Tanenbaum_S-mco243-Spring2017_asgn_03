
public class Thread2 extends Thread{

	public void run()
	{
		while (!MutualExclusion.done) {
			MutualExclusion.t2WantsToEnter = true;
			while (MutualExclusion.favoredThread == 1) {
				while (MutualExclusion.t1WantsToEnter)
					try {
						Thread2.sleep(1);
					} catch (InterruptedException e) {
						System.out.println(e.getMessage());
					}
				MutualExclusion.favoredThread = 2;
			}
			System.out.println("t2 entering critical code");
			MutualExclusion.t2WantsToEnter = false;
			System.out.println("t2 exiting critical code");
		}
	}
}
