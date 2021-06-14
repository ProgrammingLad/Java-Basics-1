package AdvanceProgramming;

import java.util.HashMap;
import java.util.ArrayList;

class DonkeySample {

}

public class HashMaps {
	public static void main(String[] args) {

//Sample of hashmaps
//Example of inefficient coding
//The use of HashMap is to store these 3 values into one go
		int a = 10;
		int b = 3;
		int c = 88;
		System.out.println("HashMap starts here");
		System.out.println();

		/*
		 * The purpose of Hash map is so we can assign a value with
		 * the same name but different output 
		 * Example: 
		 * a = 10 
		 * a = 11
		 * b = 3 
		 * b = 4
		 */
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 10);
		map.put("b", 3);
		map.put("c", 88);
		
		//map.remove("b", 3);

		System.out.println(map.get("a") + " " + "These are both a with different values");

		HashMap<String, Integer> map2 = new HashMap<String, Integer>();
		map2.put("a", 11);
		map2.put("b", 4);
		map2.put("c", 89);
		
		System.out.println(map2.get("a") + " " + "These are both a with different values");
		System.out.println();
		
		System.out.println(map.get("a")/*10 is map a*/ + map2.get("a")/*11 is map2 a*/ + " " + " We are combining both a values");
		System.out.println();
		//This shows that the programs are running left to right in order because map.get(b) and map.get2(b) DID not add map.get(a)
		//Added multiplication at the end to test the theory above
		System.out.println(map.get("b")/*3 is map a*/ + map2.get("b")/*4 is map2 b*/ + " " + " We are combining both b values" + " " + map.get("a") * map.get("b"));
		
		
		//Example, will get later
		/*
		 * SampleClass is just an example of a class created for HashMap
		 * ArrayList<DonkeySample> Sample1 = new ArrayList<>();
		 */

	}
}