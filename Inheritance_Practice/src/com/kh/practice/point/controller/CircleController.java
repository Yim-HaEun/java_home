package com.kh.practice.point.controller;

import com.kh.practice.point.model.vo.Circle;

public class CircleController {
	Circle c = new Circle();
	
	//받은 매개변수를 이용해 필드들을 초기화하고 초기화한 정보와 면적 반환 
	//면적 : PI * 반지름 *반지름 
	public void calcArea(int x, int y, int radius) {
		double calcArea = radius*radius*3.14;
	}
	
	//받은 매개변수를 이용하여 필드들을 초기화하고 초기화한 정보와 둘레 반환
	// 둘레 : PI * 반지름 * 2
	public void calcCircum(int x, int y, int height, int width) {
		double calcCircum = 3.14 * radius *2;
	}

}
