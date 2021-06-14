package Scanner;
import java.util.Scanner;
public class Scanner2{
	
	public static void main(String[] args) {
	
	/*
	Scanner input = new Scanner(System.in);
		
	
		//Global Variable - Try me using INT if backtracking!!
		String Username = "Eugene";
		String Puta = "Eugene";
		
		//Local Variable if inside {}
		do 	{
			System.out.println("Enter your username");
			Puta = input.nextLine(); //Next line where you put value of string	
			}
		
		while(Puta != "Eugene"); //Try me by changing strings
		
		System.out.println("Correct username");
	*/
		
	Scanner scanner = new Scanner(System.in);
	
	String Username;
	String Password;
		do {
		    System.out.print("Enter your username: "); //ADD ln in print if you want to put the input below, example: println
		    Username = scanner.nextLine();
		}
		
		while (!"Eugene".equals(Username));
		System.out.println("Congratulations, correct username");
		
		
		do {
		    System.out.print("Enter your password: ");
		    Password = scanner.nextLine();
		}
		
		while (!"Password".equals(Password));
		
		System.out.println("Congratulations, correct password!");
		
		}
}
