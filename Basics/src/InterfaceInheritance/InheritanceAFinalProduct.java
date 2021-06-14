package InterfaceInheritance;

public class InheritanceAFinalProduct {
	
	public static void main(String[] args) {
		//Car came out in 2010
		InheritanceCar2010 Altis2010 = new InheritanceCar2010();
		System.out.println("Altis 2010");
		Altis2010.Start();
		Altis2010.Gas();
		Altis2010.Break();
		Altis2010.Feature1();
		System.out.println();
		
		//Car came out in 2015 with ADDITIONAL FEATURE 2 which is not accessible in Altis 2010
		InheritanceCar2015 Altis2015 = new InheritanceCar2015();
		System.out.println("Altis 2015");
		Altis2015.Start();
		Altis2015.Gas();
		Altis2015.Break();
		Altis2015.Feature1();
		Altis2015.Feature2();
		System.out.println();
		
		//Car came out in 2020 with ADDITIONAL FEATURE 3
		InheritanceCar2020 Altis2020 = new InheritanceCar2020();
		System.out.println("Altis 2020");
		Altis2020.Start();
		Altis2020.Gas();
		Altis2020.Break();
		Altis2020.Feature1();
		Altis2020.Feature2();
		Altis2020.Feature3();
		System.out.println();
	}
}
