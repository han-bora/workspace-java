package kr.co.himedia.strategy;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		// TODO Auto-generated method stub
		System.out.println("고객 등급이 vip 고객의 전화를 먼저 가져 옵니다");
		
	}

	@Override
	public void sendCallAgent() {
		// TODO Auto-generated method stub
		System.out.println("업무 스킬이 높은 시니어 상담원에게 우선적으로 배분합니다");
		
	}

}
