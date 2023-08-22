package kr.co.himedia.lamda11;



public class LamdaApply {
	
	public static void main(String[] args) {
		
		
		StingOperation toUpper = s -> s.toUpperCase();
		
		StingOperation toLower = s -> s.toLowerCase();
		
		String input = "Lamda Expression";
		
		System.out.println(input.toLowerCase());
		System.out.println(input.toUpperCase());
		
		PrintString reStr = returnString();
		reStr.showString("Hello");
		
	}
	
	public static String operationString(String input, StingOperation operation) {
		return operation.apply(input);
	}

	
	public static PrintString returnString() {
		return s -> System.out.println(s + "HiMedia");
	}
	
}
