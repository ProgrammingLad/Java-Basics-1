package GetSetMethods;
//ALL TOGETHER
public class GetSetMethod4 {
	public static void main(String[] args) {
		//info
		//information
		//Employee
		//Name, Work, Age, Salary, Years
		
		//ANG HABA
		info Employee = new info();
		Employee.name = "Eugene";
		Employee.work = "Accenture";
		Employee.age = 24;
		Employee.salary = 65000;
		Employee.years = 2;

		System.out.println(Employee.name + " " + Employee.work + " " + Employee.age + " " + Employee.salary + " " + Employee.years);
		
		//PAIKLIIN PA NATIN
		information Employee2 = new information();
		Employee2.setName("Eugene");
		Employee2.setWork("Accenture");
		Employee2.setAge(24);
		Employee2.setSalary(65000);
		Employee2.setYears(2);
		Employee2.Show();
		
		
		//MAS PAIKLIIN PA NATIN
		Employee Employee3 = new Employee("Eugene", "Accenture", 24, 65000, 2);
		Employee3.PrintDetails();
		
	}
	
	
}
