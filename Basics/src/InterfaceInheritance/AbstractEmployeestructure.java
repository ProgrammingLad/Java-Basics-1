package InterfaceInheritance;

/*You make abstract to add implemented one or more common methods which interface cannot do
For example:
1. All employees have the same salary. Thus, method can be implemented.
2. If inheritance will be used, you can only declare salary method but cannot be declaring how much they are making
3. See documentation for Interface.java
4. Methods can be declared in abstract class
Example: setName getName method has CODE INSIDE. Unlike in interface, only methods can be located and called.

IMPORTANT!!!! See documentation on Interface.java to find out more
*/
//Abstract classes can be coded, unlike inheritance where only method can be defined. 
public abstract class AbstractEmployeestructure{
	String name;
	
	public void setName1(String name) {
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	public void salary(int salary) {
		System.out.println(name + " made PHP" + salary*121.25 + " for today's work");
	}
	
	/*Example of abstracts that you can declare in inheritance
	*You can ONLY declare abstract methods in inheritance, BUT YOU CANNOT PUT CODES INSIDE METHODS.
	*SEE TOP CODE FOR REFERENCE*/
	public abstract void employeeName();
	public abstract void employeeId();
	public abstract void laptopModel();
}