package ch16;

public interface Calc {
		
	double PI = 3.14;
	int ERROR = -9999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	
	// jdk8부터 디폴트 메서드와 스태틱 매서드도 인터페이스에서 구현 가능(디폴트 메서드는 오버라이딩도 가능함)
	default void description() {
		System.out.println("정수의 사칙연산을 제공합니다.");
	}

	static int total(int[] arr) {
		
		int total = 0;
		for(int num : arr) {
			total += num;
		}
		
		return total;
	}


}

