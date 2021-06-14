class ExampleOfPerson {

	private String name;

	public ExampleOfPerson(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		return sb.toString();
	}
}

public class PassingByValueExample {

	public static void main(String[] args) {

		PassingByValueExample ps = new PassingByValueExample();

		int value = 4;
		System.out.println("1. " + value);
		
		/*
		 * When .show method is called, it will immediately jump to public void show
		 * (int value) Once it's done with executing the code inside the curly brackets
		 * It will go back to 4. value
		 */
		ps.show(value);

		System.out.println("4. " + value);
		System.out.println();
		// ==========================================================
		
		ExampleOfPerson person = new ExampleOfPerson("Eugene");
		System.out.println("1. " + person);
		
		/*
		 * When .show method is called, it will immediately jump to public void show
		 * (ExampleOfPerson person) Once it's done with executing the code inside the curly brackets
		 * It will go back to 5. person
		 */
		ps.show(person);
		
		System.out.println("5. " + person);
		
		person.setName("Eugene");
		System.out.println("6. " + person);
		
		person.setName("Bob");
		System.out.println("7. " + person);
	}

	
	// ==========================================================
	
		public void show(int value) {
		
		System.out.println("2. " + value);
		/*
		 * This value is only applicable within the the {} of show(int value) It will not affect
		 * the value of String name on top If you place value = 69; on top of sysout 2.
		 * it will also modify the value
		 */
		
		value = 69;
		System.out.println("3. " + value);

	}

	// ==========================================================
		
		public void show(ExampleOfPerson person) {
			person = new ExampleOfPerson("Eidel");
			System.out.println("2. " + person);
			/*
			 * This person is only applicable within the the {} of show(ExampleOfPerson person)
			 * It will not affect the value of String name on top If you place person.setname; on top of sysout 2.
			 * it will also modify the value
			 */
			
			person = new ExampleOfPerson("Eugene");
			System.out.println("3. "+ person);
			
			person = new ExampleOfPerson("Bob");
			person.setName("Bob");
			System.out.println("4. " + person);
			
		}

}
