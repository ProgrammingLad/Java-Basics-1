package InterfaceInheritance;

/*IMPORTANT: Check documentation on AbstractEmployeestructure to see difference
*GET SET method has been initialized in AbstractEmployeestructure but in interface, it can only be called.
*Then the GET SET method will be defined inside inheritance*/
public interface Interface {
	
	int increaseMe();
	String setName(String name);
	String getName();
	
	
	//Sets maximum number that can be printed as 200
	/*int MAX = 200;
	String Errormessage = "Whoops! Thats over 200";*/
}

