package kr.co.himedia;

public class SwitchTest {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		
		int num = 5;
		
		switch(num % 3) {
		
		  case 1:
			System.out.println("나머지가 1");
			break;
		  case 2:
			System.out.println("나머지가 2");
			break;
		  case 3:
			System.out.println("나머지가 0");
			break;
		}
		

	}

}
