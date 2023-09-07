package com.kh.ArryaListPractice;

import java.util.ArrayList;


public class ArrayList {

	public static void main(String[] args) {
		/*
		 *ArrayList 이용해서 빨주노초파남보
		수정 3회 1,3,5 ->블랙, 브라운, 그린 수정 
		더하기 2회 ->주황, [옐로우],파랑,[연한파랑] 
		향상된 for문 이용해서 색상 출력하기
			최후출력빨파보
		 * */ 
		
		ArrayList<String> rainbow = new ArrayList<>();
		
		rainbow.add("빨강");
		rainbow.add("주황");
		rainbow.add("노랑");
		rainbow.add("초록");
		rainbow.add("파랑");
		rainbow.add("남");
		rainbow.add("보라");
		
		System.out.println("색 : " + rainbow);
		
		rainbow.set(1,"블랙");
		rainbow.set(3,"브라운");
		rainbow.set(5,"그린");
		
		System.out.println(rainbow);
		
		rainbow.add(1,"옐로우");
		rainbow.add(5,"연한 파랑");
		
		//for(요소의데이터타입 우리가 정할 변수명 : 목록이 들어있는 변수명){
		for (String color : rainbow) {
					System.out.println(color);
				}
		

	}

}
