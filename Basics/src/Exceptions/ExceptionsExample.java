package Exceptions;

import java.util.Scanner;

public class ExceptionsExample {

	public static void main(String[] args) {
		
		String[] pets = {"Dog", "Cat", "monkey"};
		System.out.println(pets[2]);
		//Example 1
		try {
			String[][] petsmany = {
				{"monkey1", "monkey2"},
				{"dog 1", "dog2"},
				{"cat 1", "cat2"}
			};
			System.out.println(petsmany[0][2]);	
			} catch (Exception e) {
				System.out.println("An exception happened");
			}
		System.out.println();
		
		//Example 2
		//Method
		Scanner scan = new Scanner(System.in);
		//User has to put in a number
		System.out.print("What's your fav number? ");
		
		
		//Try catch method will provide the user specific error message "That's not a number" instead of having red exception message
		try {
		int n = scan.nextInt();
		System.out.println("So your favourite number is: " + n );
		} catch (Exception e) {
			System.out.println("Thats not a number");
		}
		
		//Another try catch method for user to enter his name
		/*System.out.println("Whats your name? ");
		try {
			String name = scan.nextLine();
			System.out.println(name);
		} catch (Exception e) {
			System.out.println("Thats not your name!");
		}*/
	}
}

