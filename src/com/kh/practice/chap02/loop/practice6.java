package com.kh.practice.chap02.loop;
import java.util.Scanner;
public class practice6 {

	public static void main(String[] args) {
		// 사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
		
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 숫자 : ");
		int num1 = scan.nextInt();
		int min,max;
		System.out.print("두 번째 숫자 : ");
		int num2 = scan.nextInt();
		if(num1>num2) {
			max = num1;
			min = num2;
		}
		else {
			 max = num2;
			 min = num1;
		}
		
		for(int i = min; i<=max ;i++ ) {
			System.out.print(i + " ");
		}

	}

}
