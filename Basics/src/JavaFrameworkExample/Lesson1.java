package JavaFrameworkExample;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

class Whatever implements Comparable<Whatever> {
	private String name;
	
	public Whatever(String name) {
		this.name = name;
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append(name);
		return sb.toString();
	}	
	
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
		Whatever other = (Whatever) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Whatever person) {
			return -name.compareTo(person.name);
	}
	
	
}



public class Lesson1 {
	
	public static void main(String[] args) {
	
		List<Whatever> names = new LinkedList<Whatever>();
		
		addNames(names);
		
		getNames(names);
	}
	
	private static void addNames(Collection<Whatever> col) {
		col.add(new Whatever("Eugene"));
		col.add(new Whatever("Eidel"));
		col.add(new Whatever("Waze"));
		col.add(new Whatever("Symone"));
		
	}
	
	private static void getNames(Collection<Whatever> col) {
		for(Whatever print:col) {
			System.out.println(print);
		}
	}
}
