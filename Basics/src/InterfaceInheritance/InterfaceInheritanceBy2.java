package InterfaceInheritance;

public class InterfaceInheritanceBy2 implements Interface {
	
	private final int MAX = 45;
	private final String Errormessage = "Error this number is above 45";
	int number;
	String name;
	String action;
	
	InterfaceInheritanceBy2(){
		number = 0;
	}
	
	
	public int increaseMe() {
		if(number >= MAX) {
			System.out.println(Errormessage);
		}else {
		number += 5;
		}
		return number;
	}

	public String setName(String name) {
		this.name = name;
		return null;
	}
	
	public String getName() {
		return this.name;
	}
	
	//Additional test code not listed on interface
	public String setAction(String action) {
		this.action = action;
		return null;
	}
	
	public String getAction() {
		return this.action;
	}
}
