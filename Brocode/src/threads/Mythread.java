package threads;

public class Mythread extends Thread {
	
	
	
	@Override
	public void run(){
		
		if(this.isDaemon()) { 
			System.out.println("This is a daemon thread is runing ");
		}else {
			System.out.println("This thread is running its user thread ");
		}
	}
}
