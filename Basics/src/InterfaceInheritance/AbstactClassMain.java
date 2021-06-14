package InterfaceInheritance;

public class AbstactClassMain {
	
	public static void main(String[] args) {

		AbstractEmployeestructure employee1 = new AbstractClassEmployee1();
		AbstractEmployeestructure employee2 = new AbstractClassEmployee2();
		
		employee1.setName1("Eugene Reyes");
		employee1.employeeName();
		employee1.salary(8);
		employee1.employeeId();
		employee1.laptopModel();
		
		System.out.println();
		
		employee2.setName1("Eidel Weiss");
		employee2.employeeName();
		employee2.salary(8);
		employee2.employeeId();
		employee2.laptopModel();
	}
}
