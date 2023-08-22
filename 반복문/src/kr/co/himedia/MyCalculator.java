package kr.co.himedia;

import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner scanner  = new Scanner(System.in);
		
		while(true) {
			showMenu();
			char mychar = scanner.next().charAt(0);
			if(!checkNum(mychar)) {
				System.out.println("메뉴를 잘못 선택했습니다.");
				continue;
			}
				
			}
		

		
	
//		scanner.close();
	}


	private static boolean showMenu() {
		// TODO Auto-generated method stub
		System.out.println("메뉴를 선택하세요");
		System.out.println("1.더하기");
		System.out.println("2.빼기");
		System.out.println("3.곱하기");
		System.out.println("4.나누기");
		System.out.println("5.끝내기");
		
		
	}
	
	
	
	public static void minusnum(int x, int y) {
		int result = x- y;
		System.out.println(x+"-"+y+"="+result);}
	
	public static void addnum(int x, int y) {
		int result = x+y;
		System.out.println(x+"+"+y+"="+result);}

	public static boolean checkNum(char mychar) {
		
		if (mychar >= '0' && mychar <= '9') {
		// TODO Auto-generated method stub
		return true;
	
		}

	}

}

