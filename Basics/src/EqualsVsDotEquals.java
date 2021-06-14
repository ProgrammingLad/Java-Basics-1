
public class EqualsVsDotEquals {

	public static void main(String[] args) {
		
		String a = new String("Emma");
		String b = "Emma";
		
		String c = new String ("Whatever");
		String d = new String ("Whatever");
		
		String e = new String ("John");
		String f = "John";
		
		//For String, == Checks if they are the same OBJECT
		//First line
		if (a == b) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
		
		//.equals is used to check if it has the same output
		//Second line
		if (c.equals(d)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
		
		System.out.println(e.equals(f));
		
		int k = 10;
		int l = 10;
		int m = 20;
		int n = 21;
		int o = 1;
		
		//For int, == is used to compare value not OBJECT
		//Third line
		if (k + l + o == n) {
			System.out.println("true");
		} else {
			System.out.println("False");
		}
	}
	
}
