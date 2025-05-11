package threads;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		System.out.println(Thread.activeCount());	
		
		Thread.currentThread().setName("Main");
		System.out.println(Thread.currentThread().getName());
		
		Thread.currentThread().setPriority(10);
		System.out.println(Thread.currentThread().getPriority());
		
		System.out.println(Thread.currentThread().isAlive());
		
		for(int i =3; i>0 ; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		System.out.println("You are done!");
		
		
		
		
		Mythread thread2 =new Mythread();
		
		thread2.start();// for start thread use start function 
		thread2.run();// do only run the thread whether print the what run function has but it not sense to start the thread 
		System.out.println(thread2.isAlive());
		
		System.out.println(thread2.getName());
		
		thread2.setName("Second thread");
		System.out.println(thread2.getName());
		
		System.out.println(thread2.getPriority());//inherite the priority the of main 
		System.out.println(Thread.activeCount());	

		
		
		//Deamon thread
		System.out.println(thread2.isDaemon());
		
		thread2.setDaemon(true);
		System.out.println(thread2.isDaemon());
		thread2.run();
	}

}
