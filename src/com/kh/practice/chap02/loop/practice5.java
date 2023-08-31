package com.kh.practice.chap02.loop;
import java.util.Scanner;
public class practice5 {

	public static void main(String[] args) {
		// 1부터 사용자에게 입력 받은 수까지의 정수들의 합을 출력하세요.
		Scanner scan =new Scanner(System.in);
		System.out.print("정수를 하나 입력하세요: ");
		int num = scan.nextInt();
		int sum = 0;
		
		for(int i = 1; i<=num; i++) {
			sum += i;
			System.out.print( i+ " +  ");
			
		}
		System.out.println("= " +sum );
		

	}

}
