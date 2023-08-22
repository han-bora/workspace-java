package kr.co.himedia.operator;

import java.util.Scanner;

public class ScannerTest {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 1 이렇게 입력하고 엔터를 입력하세요.");
		int num1 = scan.nextInt();
		System.out.println("숫자를 2 이렇게 입력하고 엔터를 입력하세요.");
		
		int num2 = scan.nextInt();
		System.out.println("숫자를 3 이렇게 입력하고 엔터를 입력하세요.");
		int num3 = scan.nextInt();
		
		
		System.out.printf("%d %d %d , num1 num2 num3");
		
		scan.close();
	}

}
