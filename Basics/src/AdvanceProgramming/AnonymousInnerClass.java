package AdvanceProgramming;

class House{
	public void OutsideHouse() {
		System.out.println("You are viewing outside of the house");
	}
	
	private class LookInsideHouse{
		public void ViewInsideHouse() {
			System.out.println("You are viewing inside of the house");
		}
	}
	
	public void InsideHouse() {
	LookInsideHouse action = new LookInsideHouse();
	action.ViewInsideHouse();
	}
}

class Toilet{
	public void OutsideToilet() {
		System.out.println("You are viewing the toilet from the outside");
	}
	
	private class LookInside{
		public void ViewInsideToilet() {
			System.out.println("You are viewing the toilet from the inside");
		}
	}
	
	public void InsideToilet() {
		LookInside view = new LookInside();
		view.ViewInsideToilet();
	}
}

class Override{
	public void TestMe() {
		System.out.println("You have not yet overriden this method");
	}
	
	private class OverrideTest{
		public void Testing() {
			System.out.println("You have not yet overriden this method");
		}
	}
	
	public void TestMe2() {
		OverrideTest override = new OverrideTest();
		override.Testing();
	}
}

public class AnonymousInnerClass {
	
	public static void main(String[] args) {
		
		House house1 = new House();
		house1.OutsideHouse();
		house1.InsideHouse();
		
		System.out.println();
		
		
		//EXAMPLE OF AN OVERRIDE of methods declared in toilet1
		//IF you do a {} followed by ; at the endm it will override a method
		Toilet toilet1 = new Toilet() {
			public void OutsideToilet() {
				System.out.println("Override Successful");
			}
			
			public void InsideToilet() {
				System.out.println("Override Successful");
			}
		};
		toilet1.OutsideToilet();
		toilet1.InsideToilet();
		
		System.out.println();
		//WITHOUT OVERRIDE = Toilet2 retains the value whats stated in the class
		Toilet toilet2 = new Toilet();
		toilet2.OutsideToilet();
		toilet2.InsideToilet();
		
		System.out.println();
		
		//ANOTHER EXAMPLE
		Override o1 = new Override();
		o1.TestMe();
		o1.TestMe2();
		
		System.out.println();
		
		Override o2 = new Override() {
			public void TestMe() {
				System.out.println("Override Successful");
			}
			public void TestMe2() {
				System.out.println("Override Successful");
			}
		};
		o2.TestMe();
		o2.TestMe2();
	}
}
