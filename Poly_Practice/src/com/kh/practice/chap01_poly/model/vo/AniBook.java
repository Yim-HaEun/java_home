package com.kh.practice.chap01_poly.model.vo;

public class AniBook {
	private int accessAge; //제한나이 
	
	public void setAccessAge(int accessAge) {
		this.accessAge = accessAge;
	}
	public int getAccessAge() {
		return accessAge;
	}
	
	public AniBook() {
		
	}
	public AniBook(String title, String author, String publisher, int accessAge) {
		this.accessAge = accessAge;
	}
	@Override
	public String toString() {
		return super.toString();
	}

}
