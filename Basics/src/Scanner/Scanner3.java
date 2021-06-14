package Scanner;
import java.util.Scanner;

public class Scanner3{
	
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	
	String Username;
	String Password;
		try{
		do {
		    System.out.print("Enter your username: "); //ADD ln in print if you want to put the input below, example: println
		    Username = input.nextLine();
		}
		
		while (!"Eugene".equals(Username));
		System.out.println("Congratulations, correct username");
		} catch (SecurityException e) {
			System.out.println("Access denied, wrong username");
		}
		
		
		do {
		    System.out.print("Enter your password: ");
		    Password = input.nextLine();
		}
		
		while (!"Password".equals(Password));
		
		System.out.println("Congratulations, correct password!");
		
		}
}