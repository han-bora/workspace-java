package kr.co.himedia;

public class WhileTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1~100사이의 5와 7의 배수를 출력하고 해당 개수도 출력하시오
		//(5와 7의 공배수)
		
	
//		
//			int count=0;
//			for(int j=1; j<=100; j++) {
//				if(j % 5 !=0) continue;
//					count++;
//			}
//			
//			System.out.println(count);
//		
//			int value=0;
//			for(int j=1; j<=100; j++) {
//				if(j % 7 !=0) continue;
//					value++;
//			}
//			
//			System.out.println(value);
//		

		int num = 0;
		int count = 0;
		
		while((num++) < 100) {
			if ((num % 5) != 0 || ((num % 7 !=0))) continue;
//			if ((num % 5) != 0) continue;
//			if ((num % 7) != 0) continue;
			count++;
			System.out.println(num);
		}
		
		System.out.println("count : " + count);
		
		
	}

}

