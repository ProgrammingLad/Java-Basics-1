package JavaFrameworkExample;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lesson5Sets {

	public static void main(String[] args) {

		Set<Integer> set1 = new TreeSet<Integer>();

		set1.add(5);
		set1.add(14);
		set1.add(83);
		set1.add(21);
		set1.add(70);
		set1.add(19);

		// ==================================Iteration=================================

		for (Integer element : set1) {
			System.out.println(element);
		}
		System.out.println();

		// ==================================CHECKVALUES=================================
		System.out.println("Checking Value......");
		if (set1.contains(5)) {
			System.out.println("Value: 5 is here");
		} else {
			System.out.println("Value not found");
		}
		System.out.println("Ending search.....");
		System.out.println();

		// Contains some common elements with set1 and some new elements
		Set<Integer> set2 = new TreeSet<Integer>();

		set2.add(79);
		set2.add(16);
		set2.add(14);
		set2.add(98);
		set2.add(19);
		set2.add(65);
		
		//Check what elements are the SAME in both set1 & set 2
		System.out.println("Common numbers in both set1 & set 2: ");
		Set<Integer> intersection = new HashSet<Integer>(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);
		System.out.println();
		
		//Check what elements are DIFFERENT in both set1 & set 2
		System.out.println("Different numbers in both set1 & set2");
		Set<Integer> difference = new HashSet<Integer>(set1);
		difference.removeAll(set2);
		System.out.println(difference);
	}
}
