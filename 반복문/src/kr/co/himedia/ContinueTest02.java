package kr.co.himedia;

public class ContinueTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1부터 10까지의 숫자 중 3의 배수의 개수를 구하여 출력하시오
//		
//		int num;
//		for(num=1; num<10; num++) {
//			if((num % 3) !=0) continue;
//		}
//		System.out.println(num);
//		
		
		int count=0;
		for(int i=1; i<=10; i++) {
			if(i % 3 !=0) continue;
				count++;
		}
		
		System.out.println(count);

	}

}
