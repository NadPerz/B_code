package interfaces;

public class main {

	public static void main(String[] args) {

		Rabbit r1 = new Rabbit();
		Hawk h1 = new Hawk();
		Fish f1 = new Fish();
		
		r1.flee();
		h1.hunt();
		
		f1.hunt();
		f1.flee();
	}
	

}
