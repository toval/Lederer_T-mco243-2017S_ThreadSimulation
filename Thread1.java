package threadSimulation;

public class Thread1 extends Thread{
	
	boolean t1WantsToEnter = false;
	boolean t2WantsToEnter = false;
	boolean done = false;
	int favoredThread =1;
	
	public void run(){
		while(!done){
			
		t1WantsToEnter = true;			
			
		try {
			System.out.println("t1 to sleep");
			
			Thread.sleep((long) .1);
			System.out.println("t1 wake up");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		while(favoredThread == 2){
				while(t2WantsToEnter);

				favoredThread = 1;
			}
			//critical section code
			System.out.println("***t1 entering critical section***");
			//non critical code
			System.out.println("***t1 exiting critical section***");
			t1WantsToEnter = false;
			
			
		}
	}
}//end class
