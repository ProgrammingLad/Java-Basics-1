package ProfessionalCode;

public class ImportGetSetString {
	
		String name;
		int age;
		int yearsofworking;
		
		public void setName (String name) {
			this.name = name;
		}
		public void setAge (int age) {
			this.age = age;
		}
		
		public void setYears (int years) {
			yearsofworking = years;
		}
	
		public String toString() {
			StringBuilder import1 = new StringBuilder();
			import1.append(name).append("\t").append(age).append("\n").append("Years of working in company: ").append(yearsofworking);
			return import1.toString();
		}
}
