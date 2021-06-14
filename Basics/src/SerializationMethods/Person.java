package SerializationMethods;

import java.io.Serializable;

/*
 * To serialize a class, you have to put:
 *implements Serializable
 */
public class Person implements Serializable {
	
	private static final long serialVersionUID = 3651299991712952991L;
	
	private String name;
	private int age;
	private String occupation;
	
	public Person(String name, int age, String occupation) {
		this.name = name;
		this.age = age;
		this.occupation = occupation;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name).append(" ").append(age).append(" ").append(occupation);
		return sb.toString();
	}
	
	
}
