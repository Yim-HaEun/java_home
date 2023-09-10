package com.kh.practice.point.model.vo;

public class Point {
	private int x;
	private int y;
	
	
	public void setX(int x) {
		this.x = x;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	//기본생성자 
	public Point() {
		
	}
	//매개변수 생성자 
	public Point(int x, int y) {
		this.x =x;
		this.y = y;
	}
	//필드에 담긴 데이터를 반환하는 메소드 
	@Override
	public String toString() {
		return super.toString();
	}
	
	

}
