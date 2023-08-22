package kr.co.himedia.lambda05;

public class IntegerUtilityTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Converter<String, Integer> converter = IntergerUtility::stringToInt;
		int result = converter.convert("123");
		System.out.println("result =" + result);

	}

}
