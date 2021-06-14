package Exceptions;
public class TryCatchExceptions {

	public static void main(String[] args) {
		
	//If you want to catch an exception, run the program and look at the error message exception
	//Example: java.lang."ArrayIndexOutOfBoundsException": Inside " " is the exception
	//Instead of the long red text exception will be displayed, it will show "Array is null"
	
		try {
			String[] a = {"Eugene"};
			System.out.println(a[0]); 
			System.out.println(a[1]); //Since there is no slot [1] in array, an exception will occur
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array can't be located");
		} finally {
			System.out.println("This is where try catch is finshed");
		}
		
		System.out.println();
		System.out.println("Type in something to check on finally");
	}
}
