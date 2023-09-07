package com.kh.ArryaListPractice;
import java.util.*;
public class forPractice {

	public static void main(String[] args) {
		// 사용자로부터 5개의 정수를 입력받아서 배열에 저장한다음, 
		//향상된 for 문을 사용해서 배열의 모든 요소를 더한 결과 출력
		Scanner scan = new Scanner(System.in);
		int[] arr1 = new int[5]; 
		System.out.println("5 숫자 입력 : ");
		
		for(int i =0; i<arr1.length;i++) {
			int n = scan.nextInt();
			arr1[i] = n;
			
		}
		for(int num : arr1) {
			System.out.print(num);
		}
		
	}

}
