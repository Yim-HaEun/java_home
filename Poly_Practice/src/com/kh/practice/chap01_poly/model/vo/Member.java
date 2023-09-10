package com.kh.practice.chap01_poly.model.vo;

public class Member {
	private String name; //회원명 
	private int age; //회원나이 
	private char gender; //성별 
	private int couponCount = 0; //요리학우너 쿠폰개수 
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public void setGender(char gender) {
		this.gender = gender;
	}
	public void setCouponCount(int couponCount) {
		this.couponCount = couponCount;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public int getCouponCount() {
		return couponCount;
	}
	
	public Member() {
		
	}
	public Member(String name, int age, char gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return super.toString();
	}

}
