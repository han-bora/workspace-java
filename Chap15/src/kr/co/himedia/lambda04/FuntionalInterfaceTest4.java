package kr.co.himedia.lambda04;

public class FuntionalInterfaceTest4 {
	
	public static void main(String[] args) {
		MathOperation add = (int x, int y) -> {return x + y};
		
		int resut = add.operation(10, 20);
		System.out.println("result + " + result);

}
