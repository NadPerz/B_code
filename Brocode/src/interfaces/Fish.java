package interfaces;

public class Fish implements prey, predator{

	@Override
	public void hunt() {
		System.out.println("This fish is hunting smaller fish");
	}

	@Override
	public void flee() {
		System.out.println("This fish flee from larger fish");
		
	}
	
	
}
