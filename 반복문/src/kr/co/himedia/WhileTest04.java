package kr.co.himedia;

public class WhileTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int dan=2;
		int count;
		
		while(dan<=9) {
			count = 1;
			while(count <=9 ) {
				System.out.println(dan + " X " + count + "=" + dan * count);
				count++;
			}
			dan++;
			System.out.println();
		}

	}

}
