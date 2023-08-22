package kr.co.himedia.lamda03;

public class TriFuntionTest {

	public static void main(String[] args) {
		TriFuntion<Integer, Integer, Integer, Integer> addTriNums = (x, y, z) -> x + y + z;

		int result = addTriNums.apply(3, 1, 4);
		System.out.println("result = " + result);

	}

}
