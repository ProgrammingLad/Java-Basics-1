package JavaFrameworkExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person1 implements Comparable<Person1> {

	private String name;

	public Person1(String name) {
		this.name = name;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		return sb.toString();
	}
	//TURNS OBJECTS INTO STRING so it can be sorted
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Person1 other = (Person1) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	@Override
	public int compareTo(Person1 person) {
		int length1 = name.length();
		int length2 = person.name.length();
		
		if (length1 > length2) {
			return -1;
		} else if (length1 < length2) {
			return 1;
		} else {
			return name.compareTo(person.name);
		}
	}
	
	 /* This is to sort OBJECT person to alphabetical
	@Override
	public int compareTo(Person1 person) {
		return name.compareTo(person.name);
	}*/
	
	
}

/*
 * IMPORTANT TAKE AWAY!! If the string becomes an object, they cannot be sorted
 * using Collections.sort Example: col.add(new Person1("Eugene"));
 */
public class Lesson8NaturalOrdering {

	public static void main(String[] args) {
		List<Person1> names1 = new ArrayList<Person1>();
		SortedSet<Person1> names2 = new TreeSet<Person1>();

		addNames(names1);
		addNames(names2);

		/*
		 * Collections.sort is not needed anymore since they became an object Object is
		 * new Person1("Eugene");
		 */
		
		Collections.sort(names1);

		showNames(names1);
		System.out.println("Done with Arraylist.................");
		System.out.println();
		
		showNames(names2);
		System.out.println("Done with Treeset.................");

		// Does not need collections.sort since its Treeset, it automatically arranges
		// it
		
	}

	private static void addNames(Collection<Person1> col) {
		col.add(new Person1("Eugene"));
		col.add(new Person1("Bry"));
		col.add(new Person1("Kenneth"));
		col.add(new Person1("Edward"));
		col.add(new Person1("April"));
		

		
	}

	private static void showNames(Collection<Person1> col) {
		for (Person1 show : col) {
			System.out.println(show);
		}
	}
}
