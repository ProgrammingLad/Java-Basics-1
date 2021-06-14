package AdvanceProgramming;

import java.util.ArrayList;
import java.util.HashMap;

//Sample class for hashmap reference only
class SampleClass {
	public void a(){
		System.out.println("Wrong print buddy");
	}
	
}
public class Generics {
	
	public static void main(String[] args) {
	//Previous method 
	//Just testing downcasting method
	ArrayList list = new ArrayList();
	
	list.add("apple");
	list.add("banana");
	list.add("Fuck");
	list.add(2);
	
	String whatever = (String)list.get(1);
	String anything = (String)list.get(2);
	
	System.out.println(whatever);//DownCasting
	System.out.println(anything);//DownCasting
	
	//UPDATED
	
	ArrayList<String> J = new ArrayList<String>();
	J.add("Cat");
	J.add("Dog");
	J.add("Aligator");
	
	String K = J.get(0);
	String N = J.get(1);
	String M = J.get(2);
	System.out.println(K + N);
	

	}
}
