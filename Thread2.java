package threadSimulation;

public class Thread2 extends Thread {

	
	boolean t1WantsToEnter = false;
	boolean t2WantsToEnter = false;
	boolean done = false;
	int favoredThread = 1;
	
	public void run(){
		while(!done){
			t2WantsToEnter = true;

			while(favoredThread ==1){
				while(t1WantsToEnter);
				
				System.out.println("t2 to sleep");
				try {
					Thread.sleep((long) .1);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println("t2 wake up");
				favoredThread = 2;
			}
			//critical section code
		
			System.out.println("---t2 entering critical section---");
			//non critical code
			System.out.println("---t2 exiting critical section---");
			t2WantsToEnter = false;

			
		}
	}
}
