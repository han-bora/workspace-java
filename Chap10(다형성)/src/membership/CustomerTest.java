package membership;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerL = new Customer(202001, "이순신");
		Customer customerS = new Customer(202302, "신사임당");
		Customer customerP = new GoldCustomer(202304, "박대기");
		Customer customerK = new VIPCustomer(203230, "강두기", 7777);
		
		customerList.add(customerL);
		customerList.add(customerP);
		customerList.add(customerS);
		customerList.add(customerK);
		
		System.out.println("=======고객 정보=======");
		
		
		for(Customer customer : customerList) {
			System.out.println(customer.showInfo());
		}
		
		
		int price = 10000;
		System.out.println("=======할인율 계산 출력======");
		for (Customer customer : customerList) {
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName()+ "님이" +cost+ "원을 지불하셨습니다.");
		}
		
		
		System.out.println();
		
		System.out.println("======보너스 포인트 계산 출력======");
		for(Customer customer : customerList) {
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는" + customer.bonusPoint + "점 입니다.");
		}
		
		

	}

}
