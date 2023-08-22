package kr.co.himedia.dto;

public class Monitor {

	// TODO Auto-generated method stub

	// 멤버변수(필드)
	String color; // 모니터색상
	int channel; // 채널
	int volume; // 볼륨
	boolean power; // 전원

	// monitor를 켜거나 끄는 기능

	// 멤버메서드
	// 모니터를 켜거나 끄는 기능(power())

	public void power() {
		if (!power) {
			System.out.println("모니터가 켜졌습니다");
			this.power = !power;

		}

		else {
			System.out.println("모니터가 꺼졌습니다.");
			this.power = !power;

		}

	}

	public void channelUp() {
		this.channel++;
		System.out.println("현재 채널:" + this.channel);
	}

	public void channelDown() {

	}

}
