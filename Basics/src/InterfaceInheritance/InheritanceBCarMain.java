package InterfaceInheritance;
/* COMMON CAR FEATURES
A car has Start
A car can Gas
A car can Break
*/
//A Car has a model
//This features are shared among Cars 2010, 2015 and 2020

public class InheritanceBCarMain {
	
	//Shared Features
	public static void Start() {
		System.out.println("Starting Engine!");
	}
	public static void Gas() {
		System.out.println("Vroom!");
	}
	public static void Break() {
		System.out.println("Breaking!");
	}
	
}
