package kr.co.himedia.singletone02;

//차를 만드는 기능이 있어야함. 메소드명:createCar()

public class CarPactory {

	private CarPactory() {
	}

	private static CarPactory instance = new CarPactory();

	public static CarPactory getInstance( ) {
		if (instance == null)
			instance = new CarPactory();
		return instance;
		
	}
	
	public Car createCar() {
		Car car = new Car();
		return car;
	}
	
	}
