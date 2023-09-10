package com.kh.hw.person.controller;
/*
 * MVC 동작 원리를 이해는 했는데 아직 어려워서 헷갈려요...
 * 문제 풀이해주시면 집가서 다시한번 해볼게요 
 * 일단은 쓸 수 있는데까지 했습니다. ㅜ..*/
import com.kh.hw.person.model.vo.Student;
import com.kh.hw.person.model.vo.Employee;

public class PersonController {
	Student[] s = new Student[3];
	Employee[] e = new Employee[10];

	//각 객체배열에 저장된 객체의 수를 정수배열에 담아 반환하는 메소드 
	public void personCount() {
		
	}
	//매개변수로 받아온 데이터를 학생 객체 배열 중 빈 곳에 저장하는 메소드 
	public void insertStudent(String name, int age, double height, double weight, int grade, String major) {
		
	}
	//학생 객체 배열의 주소를 반환하는 메소드 
	public void printStudent() {
		
		
	}
	//매개변수로 받아온 데이터를 사원객체 배열 중 빈 곳에 저장되는 메소드 
	public void insertEmployee(String name, int age, double height, double weight, int salary, String dept) {
		
		
	}
	//사원객체 배열의 주소를 반환하는 메소드 
	public  void printEmployee() {
		
	}
}
