package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class practice9 {

	public static void main(String[] args) {
		//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
		//단, 9를 초과하는 숫자가 들어오면 “9 이하의 숫자만 입력해주세요”를 출력하세요.
		
	Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num  = scan.nextInt();
		int result;
		
		if (num>9) {
			System.out.println("9 이하의 숫자만 입력해주세요 ");
			
		}else {
			for(int j = num; j<=9; j++) {
				System.out.println("========  "+num+"단" +"  =========");
				
				 for(int i =1; i<=9; i++) {
					 result = i*num;
					 System.out.println( num+ "*"+ i + "=" +result );
					
				 }num++;
			}
			 
		 }
	}

}
