class Empleyado {
	private String name;
	private int age;

	public Empleyado(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name).append(age);
		return sb.toString();
	}
}

public class DotEquals {

	public static void main(String[] args) {
		
		Empleyado employee1 = new Empleyado("Eugene", 24);
		Empleyado employee2 = new Empleyado("Eidel", 23);
		
		//Just testing for the first output below if it will display true or false
		//employee2 = employee1;
		
		//Output 1
		int i = 10;
		int j = 10;
		
		int a = 2;
		int b = 1;
		int c = 1;
		
		int d = 3;
		d = b + c;
		
		System.out.println(d == a);
		
		System.out.println(employee1.equals(employee2));
	}

}
