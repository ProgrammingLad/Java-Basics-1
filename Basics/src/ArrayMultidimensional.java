
public class ArrayMultidimensional {
	public static void main(String[] args) {
		
		String[][] Username = {
				{"Eugene", "Symone", "Reyes"},
				{"Eidel", "Weiss", "Gascon"},
				{"AA", "BB"}
		};
		
		//System.out.println(Username[0][2]);
		
		for(int row = 0; row < Username.length; row++) {
			for(int col = 0; col < Username[row].length; col++) {
				System.out.printf("%s \t", Username[row][col]);
			}
			System.out.println();
		}
			
	}
}
