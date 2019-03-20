package day2.assignment18;


interface PetAnimal {
	
	void friendly();
	void playWithHumans();
	
}



public class Animal {

String color;

public String getColor() {
	return color;
}

public Animal() {}

public Animal(String color) {
	
	this.color = color;
}

public void animalExclusive() {
	
	System.out.println("Animals can be Wild or Domestic");
}

public void animalAction() {
	
	System.out.println("They make sounds");
}


public static void main(String args[])
{
	
	
	System.out.println("**********Super Class***********");
	Animal a = new Animal();
	a.animalExclusive();
	System.out.println(a.getColor());
	
	

	System.out.println("********Animal reference for Dog*************");
	Animal dog = new Dog();
	dog.animalAction();
	dog.animalExclusive();
	
	System.out.println("********Dog Reference for Dog*************");
	Dog dog1 = new Dog();
	System.out.println(dog1.getColor());
	dog1.dogExclusive();
	dog1.animalAction();
	
	System.out.println("*******Pet Animal Reference for dog**************");
	PetAnimal dog3 = new Dog();
	dog3.friendly();
	dog3.playWithHumans();
	
	System.out.println("*******Animal reference for cat**************");
	Animal cat = new Cat();
	cat.animalAction();
	cat.animalExclusive();
	
	System.out.println("******Cat Reference for Cat***************");
	Cat cat1 = new Cat();
	cat1.getColor();
	cat1.catExclusive();
	cat1.animalAction();
	cat1.friendly();
	cat1.playWithHumans();
	
	System.out.println("*******Pet Animal Reference for dog**************");
	PetAnimal cat3 = new Cat();
	cat3.friendly();
	cat3.playWithHumans();
	
	
	System.out.println("*******Animal for Hippo**************");
	Animal hippo = new Hippo();
	hippo.animalAction();
	hippo.animalExclusive();
	
	System.out.println("*******Hippo for Hippo**************");
	Hippo hippo1 = new Hippo();
	hippo1.animalAction();
	hippo1.animalExclusive();
	hippo1.hippoExclusive();
	
	System.out.println("*******Animal for Lion**************");
	Animal lion = new Lion();
	lion.animalAction();
	lion.animalExclusive();
	
	System.out.println("*******Lion for Lion**************");
	Lion lion1 = new Lion();
	lion1.animalAction();
	lion1.animalExclusive();
	lion1.lionExclusive();


}

}





 class Hippo extends Animal {
	 
		public void hippoExclusive() {
			System.out.println("This is Hippo Exclusive");
		}
	 
 }
 
 class Lion extends Animal {
	 
	 public void lionExclusive() {
			System.out.println("This is Lion Exclusive");
		}
 }
 
 
 
 class Dog extends Animal implements PetAnimal {
	 
	 public Dog(){
		 super("black");
		 
	 }

	@Override
	public void friendly() {
		System.out.println("Dog is friendly");
	}

	@Override
	public void playWithHumans() {
		System.out.println("Dog is plays");
	}
	
	public void animalAction() {
		
		System.out.println("Dog Barks");
	}
	
	public void dogExclusive() {
		System.out.println("Dog Exclusive");
	}
	
 }
	 
	 
	class Cat extends Animal implements PetAnimal {

		
		public Cat(){
			 super("White");
			 
		 }
		
		@Override
		public void friendly() {
			System.out.println("Cat is friendly");
			
		}

		@Override
		public void playWithHumans() {
			System.out.println("Cat is plays");
			
		}
		
		public void animalAction() {
			
			System.out.println("Cat Hisses");
		}
		
		public void catExclusive() {
			System.out.println("Cat Exclusive");
		}
		
		
	}
 


