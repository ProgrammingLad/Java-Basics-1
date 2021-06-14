package UpcastingAndDowncasting;

public class MainMethod {

	public static void main(String[] args) {
	
	//Parent method referencing to child object
	Parent obj1 = new Child(); //Downcasting
	obj1.Show3();
	
	//Child object referencing to child method
	Child obj2 = (Child)obj1; //Upcasting
	obj2.Show3();
	
	//Check downcasting IF statement
	/*if(obj1 instanceof Child) 
	{
		Child obj2 = (Child)obj1;
				obj2.Show2();
	}*/
	
	
	}

}
