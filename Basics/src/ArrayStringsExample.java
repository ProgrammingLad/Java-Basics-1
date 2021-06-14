
public class ArrayStringsExample {
	
	public static void main(String[] args) {
		
		String[] username = new String[4];
		
		username[0] = "Eugene";
		username[1] = "Symone";
		username[2] = "Almadin";
		username[3] = "Reyes";
		
		for(String thiscanbeanyfuckingthing: username) {
		System.out.println(thiscanbeanyfuckingthing);
		}
	}
}
