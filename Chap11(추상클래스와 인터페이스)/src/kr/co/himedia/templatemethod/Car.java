package kr.co.himedia.templatemethod;

public abstract class Car {
	
	public void startCar() {
		System.out.println("시동을 겁니다");
		
	
	}
	public void turnOff() {
		System.out.println("시동을 끕니다");
	}
	
	public abstract void drive();
	public abstract void stop();
	public void wiper() {
		
	}
	
	public void run() {
		startCar();
		drive();
		stop();
	
		
	}
	public void washCar() {
		// TODO Auto-generated method stub
		
	}

}
