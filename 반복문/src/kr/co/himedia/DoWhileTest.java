package kr.co.himedia;

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요 : ");
		
		int sum = 0;
		int input;
		
		
		do {
			input = scanner.nextInt();
			sum += input;
			
			
		} while(input !=0);
		

	}

}
