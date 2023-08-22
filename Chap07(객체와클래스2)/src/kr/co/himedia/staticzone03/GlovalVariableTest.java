package kr.co.himedia.staticzone03;


class Cat{
	static int global = 5;   //스태틱변수.( 5를 주면서 초기화 한다고 하셨는데 왜 이게 초기화지? 그냥 5라는 값을 준다는 의민가? )
	int num = 3;  //멤버변수
	

	public void printValue(int num) {
		this.num = num;
		System.out.println("num : " + num);
		System.out.println("global : " + Cat.global);
	}
	
}
public class GlovalVariableTest {
	
	public static void main(String[] args) {
		Cat.global = 10;       //스태틱 변수에 직접 접근
		
		
		Cat cat1 = new Cat();   //지역변수 (참조변수) => 스택 영역에 생성
		cat1.printValue(20);    
	
	}
	
	
	

}
