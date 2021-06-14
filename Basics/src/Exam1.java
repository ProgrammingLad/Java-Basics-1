
public class Exam1 {
	
	public static void main(String[] args) {
		
		//String exam **Passed**
		
		String noun = "you";
		String adjective = "have";
		String verb1 = "passed";
		String verb2 = "failed";
		String what = "the exam";
		String space = " ";
		String greeting = "Congratulations";
		String symbol = "!!";
		
		System.out.println(greeting + space + noun + space + adjective + space + verb1 + space + what + symbol);
		
		System.out.println("Q: Print number 2540 using 5 integer combinations:");
		//Variable exam 
		
		byte b1 = 100;
		byte b2 = 120;
		
		short s1 = 200;
		short s2 = 220;
		
		int i1 = 300;
		int i2 = 320;
		int i3 = 350;
		
		long l1 = 400;
		long l2 = 420;
		long l3 = 2000;
		long l4 = 3000;
		long l = 5000;
		//Print number (900) using one integer
		l2 = l1 + i1 + s1;
		
		//Different value because its above the hierarchy
		//System.out.println(l1);
		
		//Print number (620) using one integer
		l1 = i1 + s1 + b2;
		
		//Combining two int into one value (1520)
		l3 = l1 + l2;
		
		//For exam purposes (520)
		i2 = i1 + s2;
		
		//Fifth integer (500)
		l4 = l1 - b2;
				
		//Subtraction for fifth integer
		i3 = i2 + b1;
		
		l = l1 + l3 + i2 + l4 - i3;
		
		//make five integers combine and add total should be 2540
		System.out.println(l);
		
	
		int ii = 5;
		int iii = 10;
		
		System.out.println("Q: Make a loop statement that starts from (5) & keeps adding value till it satifies desired output (10)");
		while(ii < iii)
			{
			System.out.println("Keep adding " + ii);
			ii = ii + 1;
			}
		
		System.out.println("Q: Create an if - else statement/conditions stating values of P & PP");
		
		int p = 20;
		int pp = 10;
		
		if(p > pp) {
			System.out.println("PP is greater than P");
		}
			else if(p < pp) {
				System.out.println("PP is less than P");
			}
				else {
					System.out.println("P is equal to PP");
				}
		
		
		System.out.println("Create a number in a horizontal line that states number 1-9");
		for(int m = 1; m < 10; m = m + 1){
			System.out.printf("%d" , m);
		}
	}
}
