package ch12;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {

		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customer1 = new Customer(10010, "Tomas");
		Customer customer2 = new Customer(10011, "James");
		Customer customer3 = new GoldCustomer(10012, "Edward");
		Customer customer4 = new GoldCustomer(10013, "Percy");
		Customer customer5 = new VIPCustomer(10014, "Kim");
	
		
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
//		
//		for(Customer customer : customerList) {
//			System.out.println(customer.showCustomerInfo());
//		}
		
		
		int price = 10000;
		for(Customer customer : customerList) {
				
				int cost = customer.calcPrice(price);
				System.out.println(customer.getName() + "님이 " + cost + "원 지불하셨습니다.");
				System.out.println(customer.getName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + "입니다.");
				
			
		}
		
	}

}
