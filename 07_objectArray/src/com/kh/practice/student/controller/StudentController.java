package com.kh.practice.student.controller;

import java.util.Scanner;

import com.kh.practice.student.model.vo.Student;

public class StudentController {
	Student[] sArr = new Student[5];
	int CUT_LINE = 60;  
	Scanner scan = new Scanner(System.in);
	
	public StudentController() {
		
	}
	public void printStudent(String a, String b, int c) {
		
			System.out.print("이름 : "+ a + "/");
			System.out.print("과목 : " + b + "/");
			System.out.println("점수 : " + c );
			
		
		
		
	}
	public void sumScore(int sum) {
		int sumScore = 0;
		for (int i =0; i<sArr.length; i++) {
			sumScore += sArr[i].getScore();
		}
		System.out.print("학생 점수 합계 : " + sumScore);
		
		
		
	}
	public void avgScore(double[] avg) {
		int sum = 0;
		double avgScore = 0;
		for(int i =0; i<sArr.length; i++) {
			sum += sArr[i].getScore();
			
		}
		avgScore =sum/sArr.length;
		System.out.println("학생 점수 평균 : " + avgScore);

		
	}

}
