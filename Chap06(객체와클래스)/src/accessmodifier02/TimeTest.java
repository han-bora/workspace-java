package accessmodifier02;

public class TimeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Time time = new Time();
		
		time.setHour(16);
		time.setminute(38);
		time.setsecond(34);
		
		
		time.setHour(50);
		time.setminute(100);
		time.setsecond(100);
		
		
		System.out.println(time);
		
		
		

	}

}
