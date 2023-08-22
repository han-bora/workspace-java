package kr.co.himedia.templatemethod;

public class GenerativeAICar extends Car {
	
	@Override
	public void drive() {
		System.out.println("자율 주행 합니다");
		System.out.println("사람이 핸들을 조정합니다");
	}
	
	
	@Override
	public void stop() {
		System.out.println("브레이크를 밟아서 정지합니다");
		
	}
	
	@Override
	public void washCar() {
		System.out.println("셀프로 세차를 합니다");
	}
	


}
