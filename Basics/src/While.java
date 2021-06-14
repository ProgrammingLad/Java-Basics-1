
public class While {
	
	public static void main(String[] args) {
		
		byte b1 = 5;
		
		short s1 = 10;
		short s2 = 15;
				
		int i1 = 20;
		int i2 = 25;
		
		long l1 = 30;
		long l2 = 27;
		
		
		//*System.out.println(l1); //showing 30 because its above l1 logic
		//*boolean t1 = l1 > l2; // showing true because 30 > 27
		//*l1 = s1 + s2;
		
		
		//*System.out.println(l1); //showing 25 because below l1 sequence
		//*boolean t1 = l1 > l2; //showing false because 25 < 27
		
		//*boolean t1 = l1 < l2; //showing false because 25 < 27
		
		//loop
		while(i1 < i2)
			{
				System.out.println("hey " + i1);
				
				//Subtracts every time it runs
				i1 = i1 + 1;
			}
	}
}
