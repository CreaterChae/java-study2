package ch17;

public class Customer implements Buy, Sell { // 디폴트 메서드가 충돌날 경우 한쪽에서만 상속 가능하다.

	@Override
	public void sell() {
		System.out.println("customer sell");
	}

	@Override
	public void buy() {
		System.out.println("customer buy");
	}

	@Override // 디폴트 메서드는 반드시 오버라이딩 해줘야 함.
	public void order() {
		System.out.println("customer order");
	}

	public void hello() {
		System.out.println("hello");
	}

}

