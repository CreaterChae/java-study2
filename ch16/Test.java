package ch16;

public class Test {

	public static void main(String[] args) {
	
		int num1 = 10;
		int num2 = 2;
		
		Calc calc = new CompleteCalc(); // 조상타입의 참조변수과 자손 타입 인스턴스 연결
		// calc. 할 경우 자손만의 멤버변수인 showinfo()는 쓸 수 없다. 나머지는 상속받은 거니 다 쓸 수 있음
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		calc.description();
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));
	}

}
