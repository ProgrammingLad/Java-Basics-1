package Exceptions;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionNotFound {
	
	public static void main(String[] args) {
		//Program continues to run even with errors on the program
		try {
			openFile();
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found");
		}
		
	}
	
	public static void openFile() throws FileNotFoundException {
		File file = new File("text.txt");
		
		FileReader fr = new FileReader(file);
	}
}
