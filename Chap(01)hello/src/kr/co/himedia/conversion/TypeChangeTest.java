package kr.co.himedia.conversion;

public class TypeChangeTest {
	
	public static void main(String[] arg) {
		
		byte bNUM = 10;
		int iNUM = bNUM;
		
		int iNUM1 = 20;
		float fNUM = iNUM1;
		
		int iNUM2 = 10;
		byte bNUM1 = (byte)iNUM2;
		
		double dNUM = 3.14;
		int iNUM3 = (int)dNUM;
		
		
		
	}

}
