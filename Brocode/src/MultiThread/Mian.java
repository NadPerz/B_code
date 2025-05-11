package MultiThread;

public class Mian {

	public static void main(String[] args) throws InterruptedException {

		Mythread thread1 = new Mythread();
		
		Myrunnable runnable1 =new  Myrunnable();
		Thread thread2 = new Thread(runnable1);
		
		thread1.setDaemon(true);
		thread2.setDaemon(true);
		
		
		thread1.start();
		thread1.join(3000);// calling thread ex.main wait until the specified thread dieas or for x millisecond  
		
		thread2.start();
		
		
		System.out.println(1/0);
	}

}
