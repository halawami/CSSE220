package threading;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class ColorfulJobs {

	private HashMap<String, Double> timeForJob = new HashMap<String, Double>();
	
	/**
	 * A handy system for modifying how long each job takes.
	 * 
	 * You should not need to modify this function.
	 */
	public void setTimeForJob(String name, double numSecs) {
		timeForJob.put(name, numSecs);
	}
	
	/**
	 * Simulates doing a long calculation.
	 * You should not need to modify this function.
	 */
	public void doAJob(String name) {
		System.out.println("Starting Job " + name);
		double numSecs;
		if(timeForJob.containsKey(name)) {
			numSecs = timeForJob.get(name);
		} else {
			numSecs = 1; //default to 1 second for jobs
		}
		try {
			Thread.sleep((int) (numSecs * 1000));
		} catch (InterruptedException e) {
			throw new RuntimeException(e.toString());
		}
		System.out.println("Finishing Job " + name);
	}
	
	public void startJobs() throws InterruptedException {
		
		
		/* Makes the yellow job take 3.5 seconds to run.
		 * 
		 * This just for your testing, so you can adjust the time
		 * of the various color jobs and ensure that your dependencies
		 * work correctly 
		 */ 
		setTimeForJob("Yellow", 1.5);
		Threads myThreads = new Threads("Blue");
		Thread t1 = new Thread(myThreads);
		
		Threads myThreads2 = new Threads("Red");
		Thread t2 = new Thread(myThreads2);
		
		Threads myThreads3 = new Threads("Yellow");
		Thread t3 = new Thread(myThreads3);
		
		
		Threads myThreads4 = new Threads("Purple");
		Thread t4 = new Thread(myThreads4);
		
		Threads myThreads5 = new Threads("Orange");
		Thread t5 = new Thread(myThreads5);
		
		t1.start();//blue
		t2.start();//red
		t3.start();//yellow
		t1.join();
		t2.join();
		t4.start();//purple
		t3.join();
		t5.start();//orange
		

	}
	
	class Threads implements Runnable{
		private String jobName;
		public Threads(String name){
			this.jobName = name;
		}

		@Override
		public void run() {
			// TODO Auto-generated method stub
			doAJob(this.jobName);
		}
	}

	
	/**
	 * Creates the class and handles user input.
	 * 
	 * You should not need to modify this function.
	 * 
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		ColorfulJobs handler = new ColorfulJobs();
		handler.startJobs();
	}
}
