package JavaFrameworkExample;

import java.util.HashMap;
import java.util.Map;

public class Lesson3HashMaps {
	
	/*
	 * REMINDER: HashMaps
	 * If you print a HashMap, it will not follow the same top to bottom order
	 * It may be printed randomly, or it may be printed from greatest to least
	 * No GUARANTEE that it will come out everytime
	 * See next tutorial for LinkedHashMap and TreeMap
	 */
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(5, "Five");
		map.put(6, "Six");
		map.put(1, "One");
		map.put(4, "Four");
		map.put(9, "Nine");
		map.put(7, "Seven");
		
		for(Map.Entry<Integer, String> entry: map.entrySet()) {
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ": " + value);
		}
		
		
		
	}
}
