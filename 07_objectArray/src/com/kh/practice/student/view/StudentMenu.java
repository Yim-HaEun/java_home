package com.kh.practice.student.view;

import com.kh.practice.student.controller.StudentController;

public class StudentMenu {
	StudentController ssm1 = new StudentController();
	StudentController ssm2 = new StudentController();
	StudentController ssm3 = new StudentController();
	StudentController ssm4 = new StudentController();
	StudentController ssm5 = new StudentController();
	
	
	public StudentMenu() {
		System.out.println("========학생 정보 출력 =========");
		//StudentController 에 printStudent()의 반환 값을 통해 학생 정보 출력
		ssm1.printStudent("김길동", "자바", 100);
		ssm2.printStudent("박길동","디비",50);
		ssm3.printStudent("이길동","화면",85);
		ssm4.printStudent("정길동","서버",60);
		ssm5.printStudent("홍길동","자바",20);
		
		System.out.println("========== 학생 성적 출력 =========");
		//StudentController에 avgScore()을 통해 점수 합계와 평균 출력
		ssm1.avgScore(null);
		
		System.out.println("========== 성적 결과 출력 ==========");
		
		//학생의 점수가 CUT_LINE 미만이면 재시험 대상, 이상이면 통과 출력
		if() {
		
	}

}
