package kr.co.himedia.operator;

import java.util.Scanner;

//여러 숫자가 입력되면 일단 버퍼(BUFFER)에 내용을 넣고 스페이스(공백)이나 탭으로 구분하여 하나씩 입력된 데이터를
//변수에 대입하게 됨

//next(): 공백을 기준으로 해서 문자를 입력 (단어 입력시 사용)
//nextline(): 엔터키를 입력할때까지 문자열을 입력(문장 입력시 사용
//            버퍼비우기 (스트림 비우기)

public class ScannerTest02 {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 한자리 입력;");
		int num = scan.nextInt();
		
		System.out.println("사용자로부터 입력받은 숫자 :" + num);
		
		System.out.print("실수 한자리 입력 : ");
		double dNUM = scan.nextFloat();
		System.out.println("사용자로부터 입력받은 숫자 : " + dNUM);
		
		scan.nextLine();
		
		System.out.println("문자열을 입력 :");
		String str = scan.next();
		System.out.println("사용자로부터 입력받은 문자열 :" + str);
		
		scan.close();
	}

}
