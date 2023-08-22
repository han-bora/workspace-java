package kr.co.himedia.strategy;

public class LeastJob implements Scheduler{

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다");
		
	}

	@Override
	public void sendCallAgent() {
		// TODO Auto-generated method stub
		System.out.println("현재 상담업무가 없거나 적은 상담원에게 배분됩니다");
		
	}
	

}
