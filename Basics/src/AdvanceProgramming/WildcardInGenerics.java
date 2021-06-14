package AdvanceProgramming;
//WILD CARD PENDING
import java.util.ArrayList;

class Machine1 {

	public String toString() 
	{
		return "I am Machine";
	}
	
	public void start() {
		System.out.println("Machine starting. ");	
	}
}

class Camera1 extends Machine1 {
	public String toString() 
	{
		return "I am Camera";
	}
	
	public void snap() {
		System.out.println("Picture taken");
	}

}

public class WildcardInGenerics {
	
	public static void main(String[] args) {
		
		ArrayList<Machine1> list1 = new ArrayList<Machine1>();
		
		list1.add(new Machine1());
		list1.add(new Machine1());
		
		ArrayList<Camera1> list2 = new ArrayList<Camera1>();
		list2.add(new Camera1());
		list2.add(new Camera1());
		
		showList(list1);
	}
	
	public static void showList(ArrayList<? extends Machine1> list) {
		for (Machine1 value: list) {
			System.out.println(value);
			value.start();
		}
	}
}


