package GetSetMethods;
class info {
	String name;
	String work;
	int years;
	int age;
	int salary;
}

public class GetSetMethod1{

	public static void main(String[] args) {
		
		info techsupport = new info();
		techsupport.name = "Eugene";
		techsupport.work = "TSR";
		techsupport.age = 24;
		techsupport.salary = 10000;
		
		
		System.out.println(techsupport.name + " " + techsupport.work + " " + techsupport.age + " " + " " + techsupport.salary);
		
		info techsupport2 = new info();
		techsupport2.name = "Eidel";
		techsupport2.work = "Paypal";
		techsupport2.age = 23;
		techsupport2.salary = 10000;
		
		System.out.println(techsupport2.name + " " + techsupport2.work + " " + techsupport2.age + " " + techsupport2.salary);
		
	}
}
