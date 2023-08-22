package kr.co.himedia.array;

public class ArrayReview {

	static int[] arr = new int[10];

	public static void main(String[] args) {
		System.out.println(ArrayReview.get(arr, 2));
		ArrayReview.appendElement(arr, 0, 2024);
		System.out.println(ArrayReview.toString(arr));
		System.out.println();

	}

	public static boolean appendElement(int[] arr, int arrCount, int val) {
		arr[arrCount] = val;
		return true;

	}

	public static boolean insertElement(int[] arr, int idx) {
		if(idx > arrCount || arrCount >= arr.length)
			return false;
		
		for(int i=arrCount; i > idx; i--)
			arr[i] = arr[i-1];
		arr[idx] = val;
		return true;
}
}
