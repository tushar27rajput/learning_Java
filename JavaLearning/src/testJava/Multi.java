package testJava;

public class Multi extends Thread
{
	public void run()
	{
		// code to be executed concurrently goes here
		System.out.println("Thread is runing...");
	}
	
	public static void main(String args[])
	{
		Multi t1 = new Multi();
		// this will start the execution of the new thread
		t1.start();
		
	}
}
