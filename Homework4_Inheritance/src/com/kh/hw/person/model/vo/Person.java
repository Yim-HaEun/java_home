package com.kh.hw.person.model.vo;
/*
 * MVC 동작 원리를 이해는 했는데 아직 어려워서 헷갈려요...
 * 문제 풀이해주시면 집가서 다시한번 해볼게요 
 * 일단은 쓸 수 있는데까지 했습니다. ㅜ..*/
public class Person {
	private String name;
	private int age;
	private double height;
	private double weight;
	
	
//필드 값을 반환하고 대입하는 메소드 
	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}
	public void setHeight(double height) {
		this.height = height;
	}

	public void setWeight(double weight) {
		this.weight = weight;

	
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public double getHeight() {
		return height;
	}
	public double getWeight() {
		return weight;
	}
	public Person() { //기본 생성자 
		
	}
//매개변수 생성자 
	public Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		
	} //각 필드 반환 메소드 
	@Override
	public String toString() {
		return super.toString();
	}

}
