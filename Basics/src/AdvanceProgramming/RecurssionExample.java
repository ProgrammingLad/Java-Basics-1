package AdvanceProgramming;

public class RecurssionExample {

	/*
	 * factorial of 4 example 4*3*2*1
	 */
	public static void main(String[] args) {
		System.out.println(factorial1(300));
		sayHello(0);
	}

	private static int factorial1(int anothervalue) {
		System.out.println("This is my value: " + anothervalue);

		if (anothervalue == 150) {
			return 200;
		}
		
		if (anothervalue == 170) {
			return 10;
		}
		return factorial1(anothervalue - 130) * anothervalue;
		/*
		 * Important notes: For this to run, the LOGIC used needs to be correct 
		 * IF return value in IF statement is greater than == value, it will times return
		 * value with factorial value
		 * 
		 * If return value in IF statement is lesser than == value, it will divine
		 * return value with factorial value RETURN value is divided by equals (n)
		 * divided by return (n) EQUALS DIVIDED BY RETURN
		 */

		// ADDon for strings
	}

	//
	private static void sayHello(int number) {
		if (number == 10) {

			System.out.println("Finally equal to 10");
		} else {
			System.out.println("This is not equal to 10");
			number++;
			sayHello(number);
			
			
		}
	}

}
