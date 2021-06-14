	
	class information2{
		String name;
		String work;
		int age;
		int salary;
		int years;
	information2(String name, String work, int age, int salary, int years) {
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
		
		//TO string
		//More efficient to add .append instead of adding + since it creates another value
		public String toString() {
			StringBuilder sb = new StringBuilder();
			sb.append(name).append(" ").append(work).append(" ").append(age).append(" ").append(salary).append(" ").append(years);
			return sb.toString();
		}
	}
	
public class StringBuilder1 {
	public static void main(String[] args) {
	
		information2 employee1 = new information2("Eugene", "TSR", 24, 20000, 2);
		System.out.println(employee1);
		
		information2 employee2 = new information2("Eidel", "Eperformace", 23, 20000, 1);
		System.out.println(employee2);
	}
}
