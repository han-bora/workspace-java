package overriding;

public class polymoTest {
	
	
	//업캐스팅으로 객체생성 : 상속, 재정의(오버라이드), 동적바인딩
	//다형성 : 상위클래스가 동일한 메시지로 하위 클래스를 서로 다르게 동작시키는 객체지향 원리.
	public static void main(String[] args) {
		Animal animal = new Dog();
		animal.eat();   //실행시점에서 사용될(호출될) 메서드가 결정되는 바인딩(동적바인딩)
		
		animal = new Cat();
		animal.eat();
		
		//다운캐스팅
		//오버라이드(재정의): 동적바인딩 - 실행 시점에서 사용될(호출될)메서드가 결정되는 바인딩
		//오버라이딩 : 정적바인딩 - 컴파일 시점에서 사용될 메서드가 결정되는 바인딩
		
		((Cat)animal).eat();
	}

}
