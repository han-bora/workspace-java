package kr.co.himedia.cooperation;

public class Bus {
	
	int busNumber;
	int passengerCount;
	int money;//멤버변수
	
	public Bus(int busNumber) {
		this.busNumber = busNumber;
		
		
	}
	
	//승차하다
	public void ride(int money) { //로컬. 매개변수
		this.money += money;
		passengerCount++;
	}
	
	public void showInfo() {
		System.out.println(busNumber + "번의 버스의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
	}
	

	

}
