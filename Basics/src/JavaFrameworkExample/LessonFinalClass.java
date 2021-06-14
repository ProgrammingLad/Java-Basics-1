package JavaFrameworkExample;

import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class LessonFinalClass {

	public static String[] motorBrands = {
		"KAWASAKI", "HONDA", "YAMAHA", "SUZUKI"	
	};
	
	public static String[][] motorModels = {
			{"Z250", "Z400", "Z1000"},
			{"GTR150", "CBR500", "CBR1000"},
			{"R3", "R6", "R1"},
			{"Raider150", "GSXR150", "GSXR1000" }
	};
	
	public static void main(String[] args) {
		
		Map<String, Set<String>> motorcycleChoices = new HashMap<String, Set<String>>();
		
		for(int i=0; i<motorBrands.length; i++) {
			String brandOfMotor = motorBrands[i]; //GOES THROUGH ALL BRANDS
			String[] modelsOfMotor = motorModels[i]; //GOES THROUGH ALL MODELS
			
			Set<String> convertMultiArrayToString = new LinkedHashSet<String>();//Create new object
			
			for (String models: modelsOfMotor){
				convertMultiArrayToString.add(models);//ADDS ALL MODELS TO OBJECT
				}
			
			motorcycleChoices.put(brandOfMotor, convertMultiArrayToString);//LIST 
		}
		
		{
		//EXAMPLE USAGE TO GET SPECIFIC MODELS
		Set<String> modelsOfMotor = motorcycleChoices.get("KAWASAKI");
			
		for(String model: modelsOfMotor) {
			System.out.println("KAWASAKI MOTOR" + " " + model);
			}	
		}
		System.out.println();
		System.out.println();
		//ITERATE THROUGH THE WHOLE THING
		for (String motorBrands: motorcycleChoices.keySet()) {
			System.out.print(motorBrands);
			System.out.print(": ");
			Set<String> modelsOfMotor = motorcycleChoices.get(motorBrands);
		
			
			for (String model: modelsOfMotor) {
				System.out.print(model);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
