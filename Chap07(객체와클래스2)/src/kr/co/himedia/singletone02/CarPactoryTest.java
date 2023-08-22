package kr.co.himedia.singletone02;


//자동차 공장이 있다. 자동차 공장이 유일한 객체이고, 이 공장에서 생산되는 자동차는 생산될때마다 고유의 차번호가 부여된다.
//자동차 번호가 1001번 부터 시작되어 차가 생산되게 구현하시오.
//공장 클래스는 싱글톤 패턴을 적용하여 구현하시오.
//출력예시 : 1001 1002


public class CarPactoryTest {
	
	public static void main(String[] args) {
		
		CarPactory carPactory = CarPactory.getInstance();
		Car BMW = carPactory.createCar();
		
		
		
		System.out.println(BMW.getcarNum());
	}

}
