package kr.co.himedia.lamda10;

import kr.co.himedia.lambda09.StringConCat;

public class LamdaTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MathOperation add = new MathOperation() {
			
			@Override
			public int operation(int x, int y) {
				// TODO Auto-generated method stub
				return x + y;
			}
			
			
		};
		
		int result = add.operation(100, 200);
		System.out.println("result = " + result);
		
		
		
//		StringConCat concat3 = (s, v) -> System.out.println(s + "," +v);
//		concat3.makeString(s1, s2);
		
		
		MathOperation add2 = (int x, int y) ->x + y;
		int result2 = add2.operation(100, 200);
		System.out.println(result2);
		
		MathOperation add3 = (x, y) -> x*y;
		int result3 = add3.operation(10, 5);
		System.out.println(result3);


	}

}
