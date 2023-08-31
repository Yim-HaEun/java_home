package com.kh.practice.chap02.loop;
import java.util.Scanner;
public class practice8 {

	public static void main(String[] args) {
		// 사용자로부터 입력 받은 숫자의 단을 출력하세요.
		Scanner scan = new Scanner(System.in);
		
		System.out.print("숫자 : ");
		int num  = scan.nextInt();
		int result;
		System.out.println("========  "+num+"단" +"  =========");
		
		 for(int i =1; i<=9; i++) {
			 result = i*num;
			 System.out.println( num+ "*"+ i + "=" +result );
		 }

	}

}
