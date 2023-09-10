package com.kh.hw.person.view;
/*
 * MVC 동작 원리를 이해는 했는데 아직 어려워서 헷갈려요...
 * 문제 풀이해주시면 집가서 다시한번 해볼게요 
 * 일단은 쓸 수 있는데까지 했습니다. ㅜ..*/

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	Scanner sc = new Scanner(System.in);
	PersonController pc = new PersonController();
	
	//메인 메뉴를 출력하는 메소드 
	public void mainMenu() {
			System.out.println("1.사원 추가 ");
			System.out.println("2.사원 보기 ");
			System.out.println("9.메인으로  ");
			System.out.print("메뉴 번호 :  ");
			int n = sc.nextInt();
	}
	//학생 메뉴를 출력하는 메소드 
	public void studentMenu() {
		System.out.println("1.학생 메뉴 ");
		
	}
	//사원 메뉴를 출력하는 메소드 
	public void employeeMenu() {
		
	}
	//사용자게 객체배열에 저장할 학생 데이터를 받는 메소드 
	public void insertStudent() {
		
	}
	//객체배열에 저장된 사원 데이터를 받는 메소드 
	public void insertEmployee() {
		
	}
	public void printEmployee(){
	
	}
	

}
