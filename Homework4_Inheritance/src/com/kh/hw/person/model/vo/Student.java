package com.kh.hw.person.model.vo;
/*
 * MVC 동작 원리를 이해는 했는데 아직 어려워서 헷갈려요...
 * 문제 풀이해주시면 집가서 다시한번 해볼게요 
 * 일단은 쓸 수 있는데까지 했습니다. ㅜ..*/
public class Student {
	private int grade; //학년 
	private String major; // 전공
	
	//필드 값을 반환하고 대입하는 메소드 
	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	
	public int getGrade() {
		return grade;
	}
	public String getMajor() {
		return major;
	}
	//기본 생성자 
	public Student() {
		
	}
	//매개변수 생성자 
	public Student(String name, int age,double height, double weight, int grade, String major ) {
		this.grade = grade;
		this.major = major;
		
		
	}
	//각 필드 반환 메소드 
	@Override
	public String toString() {
		return super.toString();
	}

}
