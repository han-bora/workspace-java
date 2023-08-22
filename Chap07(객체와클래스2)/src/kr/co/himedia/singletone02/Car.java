package kr.co.himedia.singletone02;



//serialNum()

public class Car {
	
	private int carNum;
//	private String carName;
	public static int serialNum = 1000;
	
	public Car() {
		Car.serialNum++; 
		carNum = serialNum;  //생성자
		
		
	}
	

	public int getcarNum() {
		return carNum;
	}
	
//	public void setcarNum(int carNum) {
//		this.carNum = carNum;
//	}
	
}
