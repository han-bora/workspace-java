package kr.co.himedia.lambda04;

public class FuntionlInterfaceTest implements MathOperation{
	
	public static void main(String[] args) {
		
		MathOperation mo = new FuntionalInterfaceTest();
		int result = mo.operation(100, 200);
		System.out.println("result = " + result);
	}
	
	public int operation(int x, int y) {
		return x + y;
	}

}
