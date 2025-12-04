package exam06;

public class Main {

	public static void main(String[] args) {
		PrintThread1 thread =new PrintThread1();
		thread.start();
		
		Thread.sleep(1000);
		
		thread.SetStop(true);

	}

}
