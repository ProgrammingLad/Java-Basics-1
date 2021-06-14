package GetSetMethods;
class Employee {
	
	String name;
	String work;
	int years;
	int age;
	int salary;
	
	
	//CONSTRUCTOR
	Employee(String name, String work, int age, int salary, int years) {
		this.name = name;
		this.work = work;
		this.age = age;
		this.salary = salary;
		this.years = years;
	}


	public void setName(String name) {
		this.name = name;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setYears(int years) {
		this.years = years;
	}
	
	public String getName() {
		return this.name;
	}
	public String getWork() {
		return this.work;
	}
	public int getAge() {
		return this.age;
	}
	public int getSalary() {
		return this.salary;
	}
	public int getYears() {
		return this.years;
	}
	public void PrintDetails() {
		System.out.println(getName() + " " + getWork() + " "  + getAge() + " " + getSalary() + " " + getYears());
	}
}

public class GetSetMethod3Constructor {
	public static void main(String[] args) {
		
		Employee newEmployee1 = new Employee("Eugene", "TSR", 5, 23, 10000);
		newEmployee1.PrintDetails();
		
		Employee newEmployee2 = new Employee("Eidel", "CSR", 2, 23, 10000);
		newEmployee2.PrintDetails();
	}
}
