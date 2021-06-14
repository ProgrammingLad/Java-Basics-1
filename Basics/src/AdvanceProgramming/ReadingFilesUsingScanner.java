package AdvanceProgramming;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadingFilesUsingScanner {
	public static void main(String[] args) throws FileNotFoundException {
		String fileName = "G:\\New folder\\Putanginamo.txt";
		
		File textFile = new File(fileName);
		
		Scanner read = new Scanner(textFile);
		
		int value = read.nextInt();
		
		int count = 1;
		System.out.println(count + ": "+ value);
		
		read.nextLine();
		
		int count2 = 2;
		
		while(read.hasNextLine()) {
			String string = read.nextLine();
					
			System.out.println(count2 + ": " + string);
			count2++;
		}
		
		read.close();
	}
}
