package JavaFrameworkExample;

import java.util.LinkedHashMap;
import java.util.Map;

public class Lesson4LinkedMap {

	public static void main(String[] args) {
		
		/*
		 * LinkedHashMap: will RETAIN the top to bottom order of how  the code was written
		 * It does not care about the numbering and it will not retain ORDER
		 */
		Map<Integer, String> linkedHashmap = new LinkedHashMap<Integer, String>();

		linkedHashmap.put(9, "Nine");
		linkedHashmap.put(1, "One");
		linkedHashmap.put(3, "Three");
		linkedHashmap.put(7, "Seven");
		linkedHashmap.put(2, "Two");
		linkedHashmap.put(8, "Eight");

		for (Integer key : linkedHashmap.keySet()) {
			String value = linkedHashmap.get(key);

			System.out.println(key + ": " + value);
		}
	}

}
