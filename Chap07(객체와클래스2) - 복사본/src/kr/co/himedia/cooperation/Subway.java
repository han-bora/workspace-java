package kr.co.himedia.cooperation;

public class Subway {
	
	int SubwayNumber;
	int passengerCount;
	int money;//멤버변수
	
	public Subway(int subwayNumber) {
		this.SubwayNumber = subwayNumber;
		
		
	}
	
	//승차하다
	public void ride(int money) { //로컬. 매개변수
		this.money += money;
		passengerCount++;
	}
	
	
	public void showInfo() {
		System.out.println(SubwayNumber + "번의 버스의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "원 입니다.");
	}
	


}
