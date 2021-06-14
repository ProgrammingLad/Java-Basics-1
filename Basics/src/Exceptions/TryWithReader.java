package Exceptions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithReader {
	
	public static void main(String[] args) {
		File file = new File("ReadMe");
		
		try(BufferedReader br = new BufferedReader(new FileReader(file))){
			String line;
			
		
			int count = 1;
			while ( (line = br.readLine()) != null ) {
				System.out.println(count + ": " + line);
				count++;
			}
		} catch (FileNotFoundException e) {
			System.err.println("Error, please verify file name");
		} catch (IOException e) {
			System.err.println("IO Exception found");
		}
		
	}
	
}
