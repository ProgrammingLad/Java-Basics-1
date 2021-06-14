package SerializationMethods;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

//FILEOUTPUT AND OBJECTOUTPUT IS TO WRITE DATA

public class WriteDatabase {
	
	public static void main(String[] args) {
		System.out.println("Saving to database....");
		
		Person[] employee = {new Person("Eugene", 24, "TSR"), new Person("Abram", 25, "CSR"), new Person("Louris", 32, "Programmer"), 
				new Person("Ed", 27, "IT"), new Person("Bry", 28, "TSR"), new Person ("April", 32 , "CSR")};
		ArrayList<Person> employeeList = new ArrayList<Person>(Arrays.asList(employee));
		
		
		try(FileOutputStream fs = new FileOutputStream("Whatever.bin")){
			
			ObjectOutputStream os = new ObjectOutputStream(fs);
			//os.writeObject(employee);
			
			os.writeObject(employeeList);
			
			os.writeInt(employeeList.size());
			
			for (Person person: employeeList) {
				os.writeObject(person);
			}
			
			os.close();
			
		} catch (FileNotFoundException e) {
			System.err.println("Error: File 404 not found");
		} catch (IOException e) {
			System.err.println("IO Exception error");
		}
	}
}
