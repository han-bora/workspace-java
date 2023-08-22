package kr.co.himedia.staticzone;

public class NonStaticAccess {
	
	int a = 10;
	int b = 20;
	
	//객체생성접근
	YourUtill your = new YourUtill();
	int result = your.hap(a, b);


}
