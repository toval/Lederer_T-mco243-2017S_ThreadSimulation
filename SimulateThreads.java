package threadSimulation;


public class SimulateThreads {

	public static void main(String[]args){

	Thread t1 = new Thread(new Thread1());
	Thread t2 = new Thread(new Thread2());
	
	t2.start();
	t1.start();
	
	}//end main
	
	public boolean t1WantsToEnter;
	public boolean t2WantsToEnter;
	public int favoredThread;
	public static boolean done;

}
