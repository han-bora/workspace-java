package kr.co.himedia.lamda03;

import java.util.function.BiFunction;

public class BiFuntionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiFunction<Integer, Integer, Integer> add = (x, y) -> x + y;
		int result = add.apply(100, 200);
		
		System.out.println("result =" + result);
		
		
	

	}

}
