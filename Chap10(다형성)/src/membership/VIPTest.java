package membership;

public class VIPTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Customer customerP = new Customer(20230001, "박대기");   //setter없이 만드는 방법
		customerP.bonusPoint = 10000;
		System.out.println(customerP.showInfo());

	

}
}
