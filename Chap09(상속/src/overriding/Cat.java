package overriding;

public class Cat extends Animal{
	
	public Cat() {
		System.out.println("Cat 기본 생성자 호출");
	}
	
//	public void eat() {
//		System.out.println("고양이가 음식을 먹다");
//	}
	
	public void nocturnal() {
		System.out.println("밤에 활동한다");
	}

}
