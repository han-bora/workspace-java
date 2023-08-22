package kr.co.himedia.lambda05;

public class StringUtilityTest {
	
	public static void main(String[] args) {
		
		StringUtility stUtility = new StringUitlity();
		Converter<String, String> converter = stUtility::reverse;
		String result = converter.convert("Hello");
		System.out.println("result : " + result);
	}

}
