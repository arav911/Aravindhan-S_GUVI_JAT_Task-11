package task_11_guvi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileException {

	public static void main(String[] args) {
//		Creating an object for class File for accessing the required file
		File file = new File("dummypath");
		try {
//			Creating on object for FileReader to read data from the file 
			FileReader fileReader = new FileReader(file);
//			It will throws FileNotFoundException if the file mentioned in specified path is not available
		} catch (FileNotFoundException e) {
			System.out.println("File not available in the specified path: "+e.getMessage());
			e.printStackTrace();
		}

	}

}
