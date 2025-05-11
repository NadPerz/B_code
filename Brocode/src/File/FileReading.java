package File;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReading {

	public static void main(String[] args) {

//		FileReader = read the file as a stream of characters. one by one
//					 read() returns an int value which contains the byte value
//					 when read() returns -1, there is no more data to be read
		
		try {
			FileReader reader = new FileReader("art.txt");
			int data = reader.read();
			while(data != -1) {
				System.out.print((char)data);
				data = reader.read();
			}
			reader.close();
			
			
		} catch (FileNotFoundException e) {
 			e.printStackTrace(); 
 			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
