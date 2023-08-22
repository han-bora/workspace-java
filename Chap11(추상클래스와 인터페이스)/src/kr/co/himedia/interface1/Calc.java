package kr.co.himedia.interface1;

public interface Calc {
	
	double PI = 3.14;
	int ERROR = -999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void describe() {
		System.out.println("계산기를 구현합니다");
	}

	
	static int total(int[] arr) {
		int total = 0;
		
		for(int i : arr)
			total += i;
		
		return total;
	}
	
	private void myMethod() {
		System.out.println("private 메서드 호출");
	}
	
	private static void myStaticMethod() {
		System.out.println("private static 메서드 호출");
	}
}
