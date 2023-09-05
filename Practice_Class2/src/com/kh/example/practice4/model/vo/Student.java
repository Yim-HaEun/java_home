package com.kh.example.practice4.model.vo;

public class Student {

	private int grade = 1; 
	private int classroom =11;
	private String name = "임하은"; 
	private double height = 158.9;
	private char gender = '여'; 
	
	public int getGrade() {
		return grade;
	}
	public int getClassroom() {
		return classroom;
	}
	public String getName() {
		return name;
	}
	public double getHeight() {
		return height;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}
	public char getGender() {
		return gender;
	}

	

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}
	public void setName(String name) {
		this.name = name;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public Student() {
		
	}
	
	public void information() {
		System.out.println(grade+"학년 " + classroom + " 반 "+ name + "학생의 키는 " + height + "이며 성별은 "+ gender +"자입니다.");
	}
	
}
