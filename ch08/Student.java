package ch08;

import java.util.ArrayList;

public class Student {
			
			int studentID;
			String studentName;

			ArrayList<Subject> subjectList = new ArrayList<>();
			
			public Student(int id, String name) {
				studentID = id;
				studentName = name;
			}

			
		public void addSubject(String name, int score) { // addSubject 메서드가 실행되면
		
				Subject subject = new Subject(); // 서브젝트 객체생성
				subject.setName(name); // 매개변수 값을 이름으로 설정
				subject.setScore(score); // 매개변수 값을 성적으로 설정
				
				subjectList.add(subject); // 과목 객체를 배열에 저장
		}
			
		public void showScoreInfo() {
			
			int total = 0;
			
			for(Subject subject : subjectList) {
					total += subject.getScore();
					System.out.println(studentName + "학생의" + subject.getName() + "과목의 성적은" + subject.getScore() + "입니다.");
					
			
			}
			
			System.out.println(studentName + "학생의 총점은 " + total + "점 입니다.");
		}
		
		
	}

