package Exceptions;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {

	public static void main(String[] args) {

		File write = new File("Text.txt");

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(write))) {
			bw.write("This is line one");
			bw.newLine();
			bw.newLine();
			bw.write("This is line four");
			bw.newLine();
			bw.write("This is last line");
		}catch (IOException e) {
			System.err.println("Unable to read file " + write.toString());
		}
	}

}
