package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		try {
			
	
			System.out.println("Enter the number to divide: ");
			int number  = scanner.nextInt();
			
			System.out.println("Enter the number to divide by: ");
			int dnumber = scanner.nextInt();
			
			int z =number/dnumber;
			
			System.out.println("result "+z);
			
		}catch(ArithmeticException e) {
		 System.out.println("Can't divide by 0 YOU IDIOT!");
		 
		}catch(InputMismatchException e) {
			System.out.println("PLEASE ENTER A NUMBER !!!");
		}catch(Exception e) {
			System.out.println("Something went wrong");
		}finally{
			//System.out.println("This will always print");
			scanner.close();
		}
		
		
	}

}
