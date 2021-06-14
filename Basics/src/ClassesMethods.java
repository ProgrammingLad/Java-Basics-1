class WorkDatabase {
	
	//Data
	//Classes can contain Data
	String name;
	String company;
	String jobtitle;
	int age;
	int salary;
	
	//Method
	//Always start method with lower case letter
	void introduction() 		{
		for(int i=0; i<5; i++) 		{
			System.out.println("My name is: " + name + " and I'm " + age);
			System.out.println("I work in: " + company + " as " + jobtitle + " earning " + salary);
			System.out.println();
									}
						}
					}

public class ClassesMethods {
	
	public static void main(String[] args) {
		
		WorkDatabase Employee1 = new WorkDatabase();
		Employee1.name = "Eugene Reyes";
		Employee1.age = 24;
		Employee1.company = "Optum";
		Employee1.jobtitle = "Web Support";
		Employee1.salary = 50000;
		Employee1.introduction();
		
		WorkDatabase Employee2 = new WorkDatabase();
		Employee2.name = "Denn Marc Bautista";
		Employee2.age = 22;
		Employee2.company = "Optum";
		Employee2.jobtitle = "Mail Service";
		Employee2.salary = 20000;
		Employee2.introduction();
	}
}
