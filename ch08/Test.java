package ch08;

public class Test {

	public static void main(String[] args) {
	
		Student student1 = new Student(1001, "Lee");
		student1.addSubject("국어", 100);
		student1.addSubject("수학", 50);
		
		Student student2 = new Student(1002, "Kim");
		student2.addSubject("국어", 70);
		student2.addSubject("수학", 85);
		student2.addSubject("영어", 100);
		
		student1.showScoreInfo();
		System.out.println("============");
		student2.showScoreInfo();
	}

}
