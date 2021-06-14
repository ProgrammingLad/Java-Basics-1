package GetSetMethods;
class information{
	String name;
	String work;
	int years;
	int age;
	int salary;
	
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
	public void Show() {
		System.out.println(getName() + " "  + getWork() + " "  + getAge() + " " + getSalary() + " " + getYears());
	}
	
}
public class GetSetMethod2 {
	
	public static void main(String[] args) {
		
		information techsupport = new information();
		techsupport.setName("Eugene");
		techsupport.setWork("TSR");
		techsupport.setAge(23);
		techsupport.setSalary(10000);
		techsupport.setYears(1);
		techsupport.Show();
		
		information techsupport2 = new information();
		techsupport2.setName("Eidel");
		techsupport2.setWork("TSR");
		techsupport2.setAge(23);
		techsupport2.setSalary(10000);
		techsupport2.setYears(3);
		techsupport2.Show();
	}
}
