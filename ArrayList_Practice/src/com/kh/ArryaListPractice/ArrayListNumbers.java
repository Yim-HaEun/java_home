package com.kh.ArryaListPractice;
import java.util.ArrayList;
public class ArrayListNumbers {

	public static void main(String[] args) {
		// 향상된 for문을 이용해서 숫자 출력하기 (String 이용 금지) 
		//int[] numbers = {1,2,3,4,5}
		ArrayList<int> numbers = new ArrayList<>();
		
		int[] numbers = {1,2,3,4,5};
		
		System.out.println("향상된 for문을 이용해서 숫자 출력 ");
		for (String num : numbers) {
			System.out.println(num);
		}
		

	}

}
