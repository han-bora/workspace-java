package kr.co.himedia.lambda09;

public class StringConcatTest {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = "HiMeia";
		
		
		StringConCat concat = new StringconcatImpl();
		concat.makeString(s1, s2);
		
		StringConCat concat2 = new StringConCat() {
			
			public void makeString(String s1, String s2) {
				System.out.println();
			}
			
		};
		
		concat2.makeString(s1, s2);
		
		
		StringConCat concat3 = (s, v) -> System.out.println(s + "," +v);
		concat3.makeString(s1, s2);

	}

}
