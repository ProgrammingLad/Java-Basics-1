package JavaFrameworkExample;

import java.util.ArrayList;

public class Lesson1ArrayListExample {
	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		
		//System.out.println(numbers.get(0));
		
		//========================================================================================
		
		
		/*THIS IS the efficient way of removing items from the list
		 * TO Remove item of list:
		 * This remove command counts what to remove backwards
		 *Instead of 0 1 2 3 4 , it counts as 4 3 2 1 0
		 *If you execute this command at the top, it will remove the value of - to all commands below
		 */
		//numbers.remove(numbers.size() - 4);
		System.out.println("\nIteration #1: ");
		for(int i = 0; i < numbers.size(); i++) {
			System.out.println(numbers.get(i));
		}
		
		/*This method is very inefficient and is for study purposes ONLY
		 * If you remove value 0 in array list, it will be replaced PERMANENTLY by value 1
		 * Instead of 10 being 0, it now becomes 20
		 * TRY ME
		 * */
		numbers.remove(0);
		//numbers.remove(1);
		//numbers.remove(1);
		//numbers.remove(1);
		
		System.out.println("\nIteration #2: ");
		for(Integer value: numbers) {
			System.out.println(value);
		}
		
		
	}
			
	
}
