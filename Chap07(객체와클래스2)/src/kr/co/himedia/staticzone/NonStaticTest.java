package kr.co.himedia.staticzone;

public class NonStaticTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// TODO Auto-generated method stub
		
		int a = 10;
		int b = 20;
		
		int result = sum(a,b);
		System.out.println("sum = " + result);

	}
	
	public static int sum(int a, int b) {
		int result = a+b;
		return result;
		
	}




}
