package com.kh.practice.chap02.loop;

import java.util.Scanner;

public class practice2 {

	public static void main(String[] args) {
		// 위 문제와 모든 것이 동일하나, 1 미만의 숫자가 입력됐다면
		//“1 이상의 숫자를 입력해주세요”가 출력되면서 다시 사용자가 값을 입력하도록 하세요.
		Scanner scan = new Scanner(System.in);

		boolean isTrue = false;
		while(!isTrue) {//true
			System.out.println("1 이상의 숫자를 입력해주세요");
			int num = scan.nextInt();
			if (num>0) {
				for(int i = 1; i<=num; i++) {
					System.out.print(i);
				}
				isTrue = true;
				break;
			}else {
				System.out.print(" ");
			}
			
			
			}
		}
		
							
}
		
