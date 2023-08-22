package kr.co.himedia.array;

import java.util.Arrays;

class BoxA4{
	String name;
	
	public BoxA4(String name) {
		this.name = name;
	}
	
}

public class BoxArray {
	
	public static void main(String[] args) {
		
		BoxA4[] arr = new BoxA4[3];
//		System.out.println(Arrays.toString(arr));
		
		
		arr[0] = new BoxA4("이순신");
		arr[1] = new BoxA4("신사임당");
		arr[2] = new BoxA4("강감찬");
		
		System.out.println(arr[0].name);
		
	}
	

}
