package kr.co.himedia.generic05;

public class GenericLimitTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Integer[] intArr = {1, 2, 3, 4, 5};
		Double[] doubleArr = {10.0, 20.0, 30.0, 40.0, 50.0};
		
		AverageCalc<Integer> integerCalc = new AverageCalc<Integer>(intArr);
		double integerAverage = integerCalc.calculateAverage();
		System.out.println(integerAverage);
		
		
		AverageCalc<Double> doubleCalc = new AverageCalc<Double>(doubleArr);
		double doubleAverage = doubleCalc.calculateAverage();
		System.out.println(doubleAverage);
		
		
		

	}

}
