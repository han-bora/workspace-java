package overriding;

public class Dog extends Animal {
	
	public Dog() {
		
		super();
		
		
		System.out.println("Dog 기본 생성자 호출");
	}
	
//	public void eat() {
//		System.out.println("댕댕이가 음식을 먹다");
//	}
//	
	public void chase() {
		System.out.println("강아지가 공을 쫓아간다");
	}
	

}
