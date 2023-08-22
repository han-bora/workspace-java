package overriding;

public class DogCatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog dog = new Dog();
		dog.eat();
		
		System.out.println();
		
		Cat cat = new Cat();
		cat.eat();
		
		System.out.println();
		
		//업캐스팅
		
		Animal animal = new Dog();
		animal.eat();
		
		//다운캐스팅
		
		Dog ddog = (Dog)animal;
		ddog.chase();
		
		System.out.println();
	
		

	}

}
