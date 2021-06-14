package JavaFrameworkExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lesson7SortingList {

	public static void main(String[] args) {
		//===========================FIRST IS SORTING ALPHABETICALLY===============================
		List<String> animals = new ArrayList<String>();

		animals.add("Kangaroo");
		animals.add("Lion");
		animals.add("Dolphin");
		animals.add("Tiger");
		animals.add("Zebra");
		animals.add("Cat");

		Collections.sort(animals);
		
		for (String animal : animals) {
			System.out.println(animal);
		}
		System.out.println("Done with sorting animals.......");
		System.out.println();
		
		
		//===========================SECOND IS SORTING NUMBERS ASCENDING===============================
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(48);
		numbers.add(61);
		numbers.add(79);
		numbers.add(36);
		numbers.add(13);
		numbers.add(94);

		Collections.sort(numbers);

		for (Integer number : numbers) {
			System.out.println(number);
		}

		System.out.println("Done with sorting numbers.......");

	}
}
