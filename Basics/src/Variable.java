
public class Variable {

	public static void main(String[] args) {
		//Hierarchy: byte -> short -> int -> long
		
		//Can only hold 8 bits of data
		byte b1 = 5;
		byte b2 = 10;
		
		//Find out
		short s1 = 15;
		short s2 = 20;
		
		//Holds number
		int i1 = 25;
		int i2 = 30;
		
		//64 bit number
		long l1 = 35;
		long l2 = 40;
		
		//Addition of numbers - Refer to hierarchy above
		//Program rules follow top to bottom rule
		l2 = s2 + i1; //45 because i1 is below l2	
		i2 = i1; //25 because its above i1 - will be 20 if you put below i1
		i1 = b1 + s1; //20
		l1 = b1 + s1 + i1; //40 because i1 is above l1
		
		

		System.out.println(l2);
		System.out.println(l1);
		
		//Used for numbers with decimals
		double myDouble = 7.24;
		
		//Find out
		float myFloat = 7.23f;
		
		//Holds character
		char myChar = 'x';
		
		//True or false statement
		boolean myBoolean = true;
		
	}

}
