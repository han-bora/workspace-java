package kr.co.himedia;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1부터 100까지의 숫자 중 3의 배수를 출력하시오
		
		int num;
		for(num=1; num<=100; num++) {
			if ((num % 3) !=0) continue;
			System.out.println(num);
		}

	}

}
