package JavaFrameworkExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lesson9Iterators {
	
	public static void main(String[] args) {
	
		List<String> people = new LinkedList<String>();
		people.add("Eugene");
		people.add("Ed");
		people.add("Bry");
		people.add("Kenneth");
		people.add("Eidel");
		
		Iterator<String> it = people.iterator();
		
		while(it.hasNext()) {
			String peeps = it.next();
			System.out.println(peeps);
			
			if(peeps.equals("Kenneth")) {
				it.remove();
				System.out.println("Kenneth has been evicted..............");
			}
		}
		
		System.out.println();
		System.out.println("Updated list................");
		for(String peeps: people) {
			System.out.println(peeps);
		}
	}
}
