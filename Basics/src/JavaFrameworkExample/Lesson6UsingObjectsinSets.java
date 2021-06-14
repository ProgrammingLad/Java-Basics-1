package JavaFrameworkExample;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Motor{
	private String motor;
	private int price;
	
	public Motor(String motor, int price ) {
		this.motor = motor;
		this.price = price;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(" ").append(motor).append(" ").append(price);
		return sb.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((motor == null) ? 0 : motor.hashCode());
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Motor other = (Motor) obj;
		if (motor == null) {
			if (other.motor != null)
				return false;
		} else if (!motor.equals(other.motor))
			return false;
		if (price != other.price)
			return false;
		return true;
	}
	
	
}

public class Lesson6UsingObjectsinSets {

	public static void main(String[] args) {
		
		//REMOVES DUPLICATES
		
		Motor m1 = new Motor("ZX25R", 410000);
		Motor m2 = new Motor("ZX6R", 630000);
		Motor m3 = new Motor("ZX10R", 1000000);
		Motor m4 = new Motor("H2", 1500000);
		Motor m5 = new Motor("CBR250", 300000);
		Motor m6 = new Motor("ZX25R", 410000);
		
		Map<Motor, String> motor = new LinkedHashMap<Motor, String>();

		motor.put(m1, "Dream");
		motor.put(m2, "Dream ");
		motor.put(m3, "Dream ");
		motor.put(m4, "Dream");
		motor.put(m5, "Dream ");
		motor.put(m6, "Dream ");

		for(Motor key: motor.keySet()) {
			System.out.println(key + ": " + motor.get(key));
		}
		
		System.out.println();
		
		Set<Motor> motor2 = new LinkedHashSet<Motor>();
		motor2.add(m1);
		motor2.add(m2);
		motor2.add(m3);
		motor2.add(m4);
		motor2.add(m5);
		motor2.add(m6);
		
		System.out.println(motor2);
	}
}
