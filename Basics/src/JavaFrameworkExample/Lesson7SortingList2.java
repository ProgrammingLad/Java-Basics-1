package JavaFrameworkExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String> {

	// LENGTH
	public int compare(String string1, String string2) {

		int length1 = string1.length();
		int length2 = string2.length();

		if (length1 > length2) {
			return 1;
		} else if (length1 < length2) {
			return -1;
		}
		return 0;
	}

}
	//ALPHABETICAL
class Alphabetical implements Comparator<String> {

	public int compare(String string1, String string2) {
		return string1.compareTo(string2);
	}

}
	//REVERSEALPHABETICAL
class ReverseAlphabetical implements Comparator<String> {

	@Override
	public int compare(String string1, String string2) {
		return -string1.compareTo(string2);
	}

}

public class Lesson7SortingList2 {

	public static void main(String[] args) {
		// SORTING STUDENTS BASED ON NAME LENGTH
		List<String> students = new ArrayList<String>();
		students.add("Eugene");
		students.add("Bry");
		students.add("Jeungardo");
		students.add("Kenneth");
		students.add("Alishia");

		Collections.sort(students, new StringLengthComparator());

		for (String student : students) {
			System.out.println(student);
		}
		System.out.println("Done sorting student's name based on length.......");
		System.out.println();

		// ====================================================================================
		// SORTING STUDENTS ALPHABETICALLY

		List<String> students1 = new ArrayList<String>();
		students1.add("Eugene");
		students1.add("Bry");
		students1.add("Jeungardo");
		students1.add("Kenneth");
		students1.add("Alishia");

		Collections.sort(students1, new Alphabetical());

		for (String print : students1) {
			System.out.println(print);
		}
		System.out.println("Done sorting student's alphabeticaly.....");
		System.out.println();

		// ====================================================================================
		// SORTING STUDENTS REVERSE ALPHABETICALLY

		List<String> students2 = new ArrayList<String>();
		students2.add("Eugene");
		students2.add("Bry");
		students2.add("Jeungardo");
		students2.add("Kenneth");
		students2.add("Alishia");

		Collections.sort(students2, new ReverseAlphabetical());
		
		for(String print2: students2) {
			System.out.println(print2);
		}
		System.out.println("Done sorting student's reverse alphabetical");
		System.out.println();
		// ====================================================================================
		// SORTING NUMBERS IN ASCENDING ORDER
		
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(44);
		numbers.add(24);
		numbers.add(52);
		numbers.add(67);
		numbers.add(16);
		numbers.add(32);

		Collections.sort(numbers);

		for (Integer number : numbers) {
			System.out.println(number);
		}
		System.out.println("Done with sorting numbers in ascending order.........");
		System.out.println();
		
		// ====================================================================================
		// SORTING NUMBERS IN DESCENDING ORDER
		
		List<Integer> numbers1 = new ArrayList<Integer>();
		numbers1.add(44);
		numbers1.add(24);
		numbers1.add(52);
		numbers1.add(67);
		numbers1.add(16);
		numbers1.add(32);
		
		Collections.sort(numbers1, new Comparator<Integer>() {
			public int compare(Integer integer1, Integer integer2) {
				return -integer1.compareTo(integer2);
			}
		});
		
		for (Integer printnumbers: numbers1) {
			System.out.println(printnumbers);
		}
		System.out.println("Done with sorting numbers in descending order........");
		System.out.println();
	}
}
