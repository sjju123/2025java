package exam06;

public class PrintThread2 extends Thread {
	public void  run() {
		while(true) {
			System.out.println("Running!!!");
			try {
				Thread.sleep(100);
			} catch(IntettuptedException e) ;
		}
		
		
		System.out.println("Terminating!!!");
	}

}
