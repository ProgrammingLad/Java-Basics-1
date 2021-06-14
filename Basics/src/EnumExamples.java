//enums are used when you have to name an object that is NOT changeable.
enum Motors {
	KAWASAKI("ZX10R"), HONDA("CBR1000R"), SUZUKI("GSX1000R"), YAMAHA("R1");
	
	private String name;
	
	Motors(String name){
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public String toString() {
		return "The model of the motorcycle is " + name;
	}
}
public class EnumExamples {

	public static void main(String[] args) {
		
		Motors motor = Motors.KAWASAKI;
		

		switch (motor) {
			case KAWASAKI:
				System.out.println("Kawasaki");
				break;
			case HONDA:
				System.out.println("Honda");
				break;
			case SUZUKI:
				System.out.println("Suzuki");
				break;
			case YAMAHA:
				System.out.println("Yamaha");
				break;
		}
		System.out.println(Motors.KAWASAKI.name());
		System.out.println(Motors.KAWASAKI.getClass());
		System.out.println(Motors.KAWASAKI instanceof Enum);
		System.out.println(Motors.HONDA.getName());
		
	
		//Comparison
		
		/*This code is used to print out the OBJECT MOTOR 2
		INSTEAD OF DOING: System.out.println(Motors.HONDA);*/

		Motors motor2 = Motors.valueOf("HONDA");
		System.out.println(motor2);
		
		System.out.println(Motors.HONDA);
		
	}
	
}
