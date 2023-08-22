package kr.co.himedia;

import java.util.Scanner;

public class ScannerQuiz {
	
	//다음과 같은 결과가 나오게 구현하시오(scanner사용)
	//예시 : 
	//제목 : (자바자바)    <==괄호처리는 입력
	//title = 자바자바
	//가격 : (20000)
	//price = 20000
	//출판사 : (하이미디어)
	//company = 하이미디어
	//저자 : (이순신)
	//author = 이순신
	//페이지수 : (300)
	//page = 300
	//ISBN : (0101234)
	//isbn = 0101234
	
	public static void main(String[] args) {
		
//		Scanner input = new Scanner (System.in);
//		System.out.print("제목 : ");
//		System.out.println();
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("제목 :");
		String title = scanner.nextLine();
		System.out.println("title = " + title);
		
		
		System.out.print("가격 :");
		int price = scanner.nextInt();
		System.out.println("price = " + price);
		
		scanner.nextLine();
		
		System.out.print("출판사 :");
		String company = scanner.nextLine();
		System.out.println("company = " + company);
		
		System.out.print("저자 :");
		String author = scanner.nextLine();
		System.out.println("author = " + author);
		
		System.out.print("페이지수 :");
		int page = scanner.nextInt();
		System.out.println("page = " + page);
		
		scanner.nextLine();
		
		
		
		
		scanner.close();
		
		
	
	}

}
