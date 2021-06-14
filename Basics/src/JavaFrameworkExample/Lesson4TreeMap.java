package JavaFrameworkExample;

import java.util.Map;
import java.util.TreeMap;

public class Lesson4TreeMap {
	
	public static void main(String[] args) {

		/*
		 * TreeHashMap: will NOT RETAIN the top to bottom order
		 * TreeHashMap will SORT OBJECTS FROM LOWEST TO HIGHEST ORDERING
		 */
		Map<Integer, String> treemap = new TreeMap<Integer, String>();
		treemap.put(7, "Seven");
		treemap.put(4, "Four");
		treemap.put(1, "One");
		treemap.put(9, "Nine");
		treemap.put(3, "Three");
		treemap.put(5, "Five");
		

		for(Map.Entry<Integer, String> entry: treemap.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		
	}
}
