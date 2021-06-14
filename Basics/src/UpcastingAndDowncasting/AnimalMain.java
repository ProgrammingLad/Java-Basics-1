package UpcastingAndDowncasting;

public class AnimalMain {

	public static void main(String[] args) {

		
	AnimalParent dog = new AnimalDog();
	dog.Animal();
	dog.AnimalName();
	dog.AnimalAction();
	dog.AnimalLive();
	AnimalDog dogaction = (AnimalDog)dog;
	//CHECK DOCUMENTATION for reference
	//BARK is not located in AnimalParent and is only located in AnimalDog, thus requiring to upcasting
	dogaction.Bark();
	System.out.println();
	System.out.println();
	
	AnimalParent bird = new AnimalBird();//DOWNCASTING
	bird.Animal();
	bird.AnimalName();
	bird.AnimalAction();
	bird.AnimalLive();
	AnimalBird birdaction = (AnimalBird)bird;
	//CHECK DOCUMENTATION for reference
	//Chirp is not located in AnimalParent and is only located in AnimalBird, thus requiring upcasting
	birdaction.Chirp();
	System.out.println();
	System.out.println();
	
	AnimalFish fish = new AnimalFish();//DOWNCASTING
	fish.Animal();
	fish.AnimalName();
	fish.AnimalAction();
	fish.AnimalLive();
	AnimalFish fishaction = (AnimalFish)fish;
	//CHECK DOCUMENTATION for reference
	//Nemo is not located in AnimalParent and is only located in AnimalFish, thus requiring upcasting
	fishaction.Nemo();
	}
	
	
}
