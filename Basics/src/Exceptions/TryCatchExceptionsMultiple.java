package Exceptions;

public class TryCatchExceptionsMultiple {
	
	public static void main(String[] args) {
		
		/*Line 14 and line 17 are errors.
		1. First error is line 14: IntArray. Array starts counting from 0-5(6) and it does not have a 6th slot
		2. Second error is line 17: Method. You can't divide by 0
		3. Since IntArray error is detected first before the Method, it will display array exception error first
		4. Try Switching a[6] and int k to check which Exception will run first*/
		
		try {
			int a[] = new int[6];
			a[6] = 8; //Try changing to 5 and see what exception will be caught
			int i = 6;
			int j = 0; //Error since you can't divide 6 by 0, try changing to value 2 and see if it works.
			int k = i/j;
		
			System.out.println(k);
		
		/*Catch statement will prioritize hierarchy of statements above REGARDLESS which catch comes first
		
		Catches prioritizes top to bottom hierarchy
		If we put catch Exception at the very top, it will execute without needing the others as it catches ALL exceptions*/
		
		//1. First method to be caught, if Arithmetic equation is correct then will proceed to 2.
		}catch (ArithmeticException e) {
			System.out.println("Error: Please check your method ");
			
		//2. Second method to be caught, if there is no error in Array, proceed with 3.
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Please check your int array");
			
		//3. If there is any exception which is not declared at catch methods on top, this will catch all exceptions.
		}catch (Exception e) {
			System.out.println("There is an error but I dont know what");
		}
	}
}
