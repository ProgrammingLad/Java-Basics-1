
public class Array1 {
	
	public static void main(String[] args) {
		
		//Sample code
		/*
		int[] values;
		values = new int[10];
		
		values[0] = 50;
		values[1] = 100;
		values[2] = 200;
		values[3] = 300;
		values[4] = 400;
		values[5] = 500;
		values[6] = 600;
		values[7] = 700;
		values[8] = 800;
		values[9] = 900;
		
		//System.out.println(values[4]);
		
		for(int i = 0; i < values.length; i++) 
		{
			System.out.println(values[i]);
		}*/
		
		//{Specifies how many Arrays could be used, <n> inputs = n[]}
		String[] username; //**{"Eugene","Symone","Reyes", " ", " "};
		username = new String[3];
		//**String[] username2 = {"Eugene","Symone","Reyes"};
		
		//Could also be used to declare independent number of string
		//Follow string declaration at <username> value
		//**String[] username3 = new String[3];
		username[0] = "Eugene";
		username[1] = "Symone";
		username[2] = "Reyes";
		
		//COMMENTED OUT FOR STUDY PURPOSE, EXPERIMENT WITH ME!!! (<username>,<username3>)
		//**<username3>[3] = " ";
		//**<username3>[4] = "Reyes";
		
		for(int i = 0; i < username.length; i++) {
			System.out.print(username[i]);
		}
		
		
		
	}
}
