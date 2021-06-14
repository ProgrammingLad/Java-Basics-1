package JavaFrameworkExample;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
 * Sources
 * https://www.youtube.com/watch?v=WwfhLC16bis&t=884s - Detailed explanation
 * https://www.youtube.com/watch?v=YQQio9BGWgs - Simple explanation
 */
public class Lesson2LinkedList {
	
	public static void main(String[] args) {
		
		List<Integer> linkedlist = new LinkedList<Integer>();
		linkedlist.add(9);
		linkedlist.add(7);
		linkedlist.add(2);
		linkedlist.add(4);
		linkedlist.add(5);
		linkedlist.add(6);
		
		//System.out.println(linkedlist.get(1));
		
		//Iterator is used to go through EACH LINE of the list
		
		Iterator it = linkedlist.iterator();
		
		while(it.hasNext()) {
			if((int)it.next() == 5) {
				System.out.println("We found 5");
			} else {
				System.out.println("Still searching");
			}
		}
	}
}
		