package kr.co.himedia.array;

import java.util.Arrays;

public class CharArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] charArr = new char[26];
		
		
		
		System.out.println(Arrays.toString(charArr));
		
//
//		char[] arr2 = new char[26];
//		char total = 0;
//		
//		
//		for(char A=0; A<arr2.length; A++) {
//			total += arr2[A];
//		}
//		
//		
//		System.out.println(arr2);
		
		char ch = 'A';
		for(int i=0; i<charArr.length; i++) {
			charArr[i] = ch++;		}
		
		System.out.println(charArr);
		
		//향상된 for문
		//for(변수:배열){}
		for(char alpha : charArr) {
			
			System.out.println(alpha + "," + (int)alpha);
		}
		
		
		

	}

}
