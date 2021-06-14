package SerializationMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
//FILEINPUT AND OBJECTINPUT IS TO READ DATA
public class ReadDatabase {

	public static void main(String[] args) {
		System.out.println("Reading database.....");	
		
	
			try(FileInputStream fi = new FileInputStream("Whatever.bin")){
		
				ObjectInputStream os = new ObjectInputStream(fi);
				
				//Person[] employee = (Person[])os.readObject();
				
				ArrayList<Person> employeeList = (ArrayList<Person>)os.readObject();
				/*
				* Without this FOR statement, the text will not be read. 
				*Try to remove this code and see what happens
				*/
				/*for(Person person: employee) {
					System.out.println(person);
				}*/
				
				for (Person person: employeeList) {
					System.out.println(person);
				}
				
				int num = os.readInt();
				
				for(int i = 5; i < num; i++) {
					Person person = (Person)os.readObject();
					System.out.println(person);
				}
				
				os.close();
				
				
			} catch (FileNotFoundException e) {
			System.err.println("Error: File 404 not found");
			} catch (IOException e) {
			//System.err.println("Error: IO Exception error");
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				System.err.println("Error: Class not found");
			} catch (ClassCastException e) {
				System.err.println("Error: Invalid Casting");
			}
	}
}
