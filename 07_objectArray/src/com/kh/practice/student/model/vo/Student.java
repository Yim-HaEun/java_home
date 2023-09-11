package com.kh.practice.student.model.vo;

public class Student {
	private String name; //이름 
	private String subject; //과목 
	private int score; // 점수 

	public void setName(String name) {
		this.name = name;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public String getSubject() {
		return subject;
	}
	public int getScore() {
		return score;
	}
	public Student() { //기본 생성자 
		
	}
	public Student(String name, String subject, int score) { //3개의 초기값을 받는 생성자 
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	public void  inform(String info) {//Student 클래스의 모든 필드 값들을 합쳐 반환
		
	}
}
