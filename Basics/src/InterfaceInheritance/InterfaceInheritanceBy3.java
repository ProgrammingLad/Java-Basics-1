package InterfaceInheritance;

public class InterfaceInheritanceBy3 implements Interface {
	int number;
	private final int MAX = 500;
	private final String Errormessage = "Error this message is above 500";
	String name;
	
	InterfaceInheritanceBy3(){
		number = 0;
	}

	public int increaseMe() {
		if(number >= MAX) {
			System.out.println(Errormessage);
		}else {
		number += 100;
		}
		return number;
	}

	
	public String setName(String name) {
		return this.name = name;
	}
	
	public String getName() {
		return this.name;
	}


	/*public int setMax() {
		return 0;
	}*/

}
