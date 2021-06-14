import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {

		Scanner command = new Scanner(System.in);
		
		System.out.print("Please enter a value: ");
		int value = command.nextInt();
		
		switch (value) {
		case 0:
			System.out.println("You have entered the least value possible");
			break;
			
		case 5:
			System.out.println("You have entered value thats in the middle");
			break;
			
		case 10:
			System.out.println("You have entered the maximum value allowed");
			break;
			
		default:
			System.out.println("Value is not recognized");
		}
		
	}
}
