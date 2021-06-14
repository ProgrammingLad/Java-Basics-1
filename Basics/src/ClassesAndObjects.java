class Work {
	
	//Data
	//Classes can contain Data
	String name;
	int age;
}

class Game {
	
	String steamnickname;
	String game;
	int MMR;
	
}

public class ClassesAndObjects {

	public static void main(String[] args) {
		
		Work Eugene = new Work();
		Eugene.name = "Eugene Reyes";
		Eugene.age = 24;
		
		Work Eidel = new Work();
		Eidel.name = "Eidel Weiss";
		Eidel.age = 23;
		
		System.out.print(Eugene.name + "\t");
		System.out.print(Eugene.age);
		System.out.println(" "); //FOR spacing
		System.out.println(" ");
		
		Game Marlon = new Game();
		Marlon.steamnickname = "Bogsmeister";
		Marlon.game = "Dota";
		Marlon.MMR = 5500;
		
		Game Aaron = new Game();
		Aaron.steamnickname = "ChongkiSir";
		Aaron.game = "Valorant";
		Aaron.MMR = 0;
		
		System.out.println(Aaron.steamnickname); 
		System.out.println(Aaron.game);
	}
}
