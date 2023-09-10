package com.kh.hw.person.model.vo;
/*
 * MVC 동작 원리를 이해는 했는데 아직 어려워서 헷갈려요...
 * 문제 풀이해주시면 집가서 다시한번 해볼게요 
 * 일단은 쓸 수 있는데까지 했습니다. ㅜ..*/
public class Employee {
	private int salary;//급여 
	private String dept; //부서 
	
	//필드 값을 반환하고 대입하는 메소드 
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getSalary() {
		return salary;
	}
	
	public String getDept() {
		return dept;
	}
	//기본 생성자 
	public Employee() {
		
	}
	//매개변수 생성자 
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		this.salary = salary;
		this.dept = dept;
		
	}
	//각 필드 반환 메소드 
	@Override
	public String toString() {
		return super.toString();
	}
}
