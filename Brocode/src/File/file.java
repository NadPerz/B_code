package File;
import java.io.File;



public class file {

	public static void main(String[] args) {

//		file= an abstract representation of file and directory pathnames
//		we import file with direction of file instead of copy that file paste here   C:/Users/Admin/Desktop/
		 
		File file = new File("secret_message.txt");
		
		if(file.exists()) {
			System.out.println("That file exists :O!");
			System.out.println(file.getPath());
			System.out.println(file.getAbsolutePath());
			System.out.println(file.isFile());
//			file.delete();

			
		}else {
			System.out.println("That file doesn't exist :(");
		}
		
		
	}

}
