package JavaFrameworkExample;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Lesson8Queue {

	public static void main(String[] args) {

		Queue<String> bbq1 = new ArrayBlockingQueue<String>(10);
		bbq1.add("Eugene");
		bbq1.add("Ed");
		bbq1.add("April");
		bbq1.add("Kenneth");
		bbq1.add("Bryan");
		bbq1.add("Dane");
		
		for (String print: bbq1) {
			System.out.println("Next to get barbeque: " + print);
		}
		
		System.out.println();
		System.out.println("Removed from Queue: " + bbq1.poll() + "Enjoy your barbeque");
		System.out.println();
		
		System.out.println("Now running updated queue.........");
		for (String print: bbq1) {
			System.out.println("Queue number: " + print);
		}
		
		System.out.println();
		System.out.println("Head of queue is now " + bbq1.element());
		System.out.println("Next in line is for berbeque is : " + bbq1.peek());
	}
}
