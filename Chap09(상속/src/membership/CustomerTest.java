package membership;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Customer customerL = new Customer();
		customerL.setCustomerName("이순신");
		customerL.setCustomerId(20230718);
		customerL.bonusPoint = 1000;
		System.out.println(customerL.showInfo());
		
		
		System.out.println();
		
		Customer customerS = new Customer(20230001, "김철수");   //setter없이 만드는 방법
		customerS.bonusPoint = 10000;
		System.out.println(customerS.showInfo());
		
		System.out.println();
		
		VIPCustomer customerT = new VIPCustomer();
		customerT.setCustomerName("박영희");
		customerT.setCustomerId(20230002);
		customerT.bonusPoint = 50000;
		System.out.println(customerT.showInfo());
		
		System.out.println();
		
		VIPCustomer customerP = new VIPCustomer(20230003, "이무기");
		customerP.bonusPoint = 100000;
		System.out.println(customerP.showInfo());
		
		System.out.println();
		
		Customer customerK = new VIPCustomer(20230005, "강하리");
		customerK.bonusPoint = 20000;  //업캐스팅. 자동형변환
		System.out.println(customerK.showInfo());
		
		System.out.println();
		
		Customer customerR = new VIPCustomer(20230006, "리무기");
		customerR.bonusPoint = 100000;
		int price = customerR.calcPrice(100000);
		System.out.println(customerR.showInfo() + "지불 금액은 " + price + "원 입니다.");
		
		
		
	}

}
