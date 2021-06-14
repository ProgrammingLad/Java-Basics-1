package JavaFrameworkExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Lesson2LinkedList2 {

	public static void main(String[] args) {

		List<String> employees = new LinkedList<String>();
		employees.add("Eugene");
		employees.add("April");
		employees.add("Denn Marc");
		employees.add("Raj");
		employees.add("Bryan");

		Iterator it = employees.iterator();

		while (it.hasNext()) {
			if((String)it.next() == "Bryan") {
				System.out.println("We found Bryan");
				employees.remove("Bryan");
			}else {
				System.out.println("Still looking for Bryan to remove on the list");
			}
		}
		
		employees.forEach(System.out::println);
	}

}
