class Person {
	String name;
	int workingdays;
	int savings;

	int daystillsalary() {
		int currentdate = 5 - workingdays;
		
		return currentdate;
	}

	int savings() {
		int savingslefttillninja = 250000 - savings;
		
		return savingslefttillninja;
	}
	
	int dutydays() {
		return workingdays;
	}
	
	int bankaccount() {
		return savings;
	}
}
 


public class ClassesMethodsInput {
	public static void main(String[] args) {
		
		Person employee1 = new Person();
		employee1.name = "Eugene Reyes";
		employee1.workingdays = 30;
		employee1.savings = 70000;
		
		int daysremaining = employee1.daystillsalary();
		int neededmoneyforninja = employee1.savings();
		int workingdays =  employee1.dutydays();
		
		System.out.println("I work " + workingdays + " days in a month");
		System.out.println("Days left till sahod " + daysremaining);
		System.out.println("Kailangan pa ng " + neededmoneyforninja);
		
		
	}
}
