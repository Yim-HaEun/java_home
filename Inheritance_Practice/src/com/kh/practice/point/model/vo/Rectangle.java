package com.kh.practice.point.model.vo;

public class Rectangle {

	
	private int width;
	private int height;
	
	
	public void setWidth(int width) {
		this.width = width;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public int getHeight() {
		return height;
	}
	//기본 생성자 
	public Rectangle() {
		
	}
	//매개변수 생성자 
	public Rectangle(int x, int y, int width, int height) {
		
	}
	//필드에 담긴 데이터를 반환하는 메소드 
	@Override
	public String toString() {
		return super.toString();
	}

	

}
