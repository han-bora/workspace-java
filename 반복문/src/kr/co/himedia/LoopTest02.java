package kr.co.himedia;

import java.util.Scanner;

public class LoopTest02 {
	
	public static void main(String[] args) {
		
		
		//구구단을 출력합니다.
		//몇단부터 출력할까요? : (입력)
		//끝단은 얼마인가요? : (입력)
		
//		for(int i = 2; i<10; i++) {
//			
//			for(int j=1; j<10; j++) {
//				System.out.println(i +"*"+j +"="+(i*j));
//			}
//			
//			System.out.println();}}}
//		
//		
//		Scanner scanner = new Scanner(System.in);
//				
//				
//		System.out.print("몇 단부터 출력할까요?");
//		String title = scanner.nextLine();
//		System.out.println("result");
//		
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("구구단을 출력합니다");
		System.out.print("몇단부터 출력할까요? : ");
		int start = scanner.nextInt();
		
		System.out.print("끝단은 얼마인가요?");
		int end = scanner.nextInt();
		
		for(; start<==end; start++) {
			System.out.println("====="+start+"단====");
		
		


		}
	}

}
