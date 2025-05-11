package File;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class fileWriting {

	public static void main(String[] args) {
		
		try {
			FileWriter writer = new FileWriter("poem.txt");
			writer.write("Roses are red\n Violet are blue \n booty booty \n Rocking everywhere");
			writer.append("\n(A poem by Nadija)");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
