package InterfaceInheritance;

public class MainMethod {
	public static void main(String[] args) {
		
		InterfaceInheritanceBy2 Test1 = new InterfaceInheritanceBy2();
		Test1.setName("Eugene");
		Test1.setAction(" adds this by ");
		
		
		Interface ob;
		
		for (int i = 0; i < 10; i++){
			ob = Test1; //Calls methods listen in Interface. Since getAction() is not in interface, we need to use Test1 instead of ob. Check Interface for more info
			
			System.out.println(ob.getName() + Test1.getAction() + ob.increaseMe());

			}
		
		System.out.println();
		InterfaceInheritanceBy3 Test2 = new InterfaceInheritanceBy3();
		for(int l = 0; l < 10; l++) {
			ob = Test2;
			System.out.println(ob.increaseMe());
			}

	}


}
