package ch17;

public class Test {

	public static void main(String[] args) {
		
		Customer customer = new Customer();
		customer.buy();
		customer.sell();
		customer.order();
		customer.hello();
		
		Buy buyer = customer; // 형변환 buy타입으로 형변환 했기 때문에 buy 인터페이스가 가진 메서드 밖에 못 씀
		
		buyer.buy(); // 단 buy의 구현 안 된 메서드가 호출되는 것이 아니라 오버라이딩 된 메서드가 호출
		buyer.order();
		
		Sell seller = customer;
		
		seller.sell();
		seller.order();
		
		
	}

}
