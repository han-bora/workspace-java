package accessmodifier02;

public class Time {

	private int hour;
	private int minute;
	private int second;

	// getter()
	public int getHour() {
		return hour;
	}

	public void setHour(int hour) {
		// 예외처리코드
		if (hour < 0 || hour > 23) {
			System.out.println("시간을 잘못 입력하셨습니다.");
		}
		this.hour = hour;
	}

	public int getminute() {
		return minute;
	}

	public void setminute(int minute) {
		// 분에 대한 예외처리 코드
		if (minute < 0 || minute > 59) {
			System.out.println("분을 잘못 입력하셨습니다.");
		}
		this.minute = minute;
	}

	public int getsecond() {
		return second;
	}

	public void setsecond(int second) {
		if (second < 0 || second > 59) {
			System.out.println("초를 잘못 입력하셨습니다.");
		}
		this.second = second;
	}

	@Override
	public String toString() {
		return this.getHour() + "시 " + 
	           this.getminute() + "분 " + 
			   this.getsecond() + "초 입니다.";
	}

}
