package MultiThread;

public class Myrunnable implements Runnable {

	@Override
	public void run() {
 
		for(int i = 0; i < 10; i++) {
			System.out.println("Thread #2: "+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
 				e.printStackTrace();
			}
		}
		System.out.println("Thread number 2 is finished :)");
	
	}

}
