package Exceptions;
//WITH CATCH STATEMENT VS WITHOUT
//Wrapping IF ELSE statements with TRY CATCH statements

public class TryCatchExceptions2 {
	
	static void  checkAge(int age) {
		try {
			if (age < 18) {
			throw new ArithmeticException("Access denied - you must be at least 18 years old.");
			}
			else {
				System.out.println("Access granted");
			}
		} catch (ArithmeticException e) {
			System.out.println("Access denied");
		}
	}
	
	static void checkAge2(int agee) {
		if (agee < 20) {
		throw new ArithmeticException("Error - To view this page you must be at least 20 years old");
	} else {
		System.out.println("Access granted");
	}
}
	
	//Run this program
	//TOP is a sample of a code with catch exception and the bottom is example of without catch exception
	public static void main(String[] args) {
		checkAge(17);
		System.out.println();
		checkAge2(18);
	}
}
