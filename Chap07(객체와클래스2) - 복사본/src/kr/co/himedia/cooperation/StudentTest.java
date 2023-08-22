package kr.co.himedia.cooperation;

public class StudentTest {
	
	public static void main(String[] args) {
		
		Student studentLee = new Student("이순신", 50000);
		Student studentShin = new Student("신사임당", 100000);
		
		Bus bus124 = new Bus(124);
		Subway subway8 = new Subway(8);
		
		studentLee.takeBus(bus124);
		studentLee.takeBus(bus124);
		studentShin.takeSubway(subway8);
		studentShin.takeBus(bus124);
		
		studentLee.showInfo();
		studentShin.showInfo();
		
		bus124.showInfo();
		subway8.showInfo();
	}

}
