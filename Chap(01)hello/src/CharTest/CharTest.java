package CharTest;

public class CharTest {
	
	public static void main(String[] args) {
		char ch = 'A';
		System.out.println("ch = " + ch);
		
		int capitalA = 'A';
		System.out.println("capitalA = " + capitalA);
		
		int capitalB = 'B' + 1;
		System.out.println("capitalB + 1 = " + (char)capitalB);
		
		
		System.out.println();
		
		
		//'가'라는 한글 한문자를 변수에 저장하고 출력하시오
		
		char a = '가';
		System.out.println(a);
		
		char Gha = '가';
		System.out.println("Gha = " + Gha);
		
		
		int GhaD = '가';
		System.out.println("GhaD = " + GhaD);
		
		//대문자 'A'를 문자 'a'로 변환하여 출력하시오.
		
		char upperA = 'A';
		char lowera = (char)(upperA + 32);
		System.out.println("lowera = " + lowera);
		
		
		char loweru = 'u';
		int upperU = loweru - 32;
		System.out.println("upperU = " + (char)upperU);
		
		System.out.println();
		
		
		//1+2=99
		int data = '1' + '2';
		System.out.println("'1' + '2' = " + data);
				
		//0=48
		char i = '1'; //49~48
		char j = '2';
		int sum = (i-'0') + (j-'0');
		System.out.println("sum = " + (sum));
		
		
		
		
		
	}

}
