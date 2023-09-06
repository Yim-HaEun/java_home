package com.kh.practice.dimension;

public class Dimension {
	public void practice1() {
		//3행 3열짜리 문자열 배열을 선언 및 할당하고
		//인덱스 0행 0열부터 2행 2열까지 차례대로 접근하여 
		//“(0, 0)”과 같은 형식으로 저장 후 출력하세요.
		
		int arr1[][] = { {0,0,0},
						{1,1,1},
						{2,2,2}};
		
		for(int i =0; i <arr1.length; i++) {
			for(int j =0; j<arr1[i].length; j++) {
				System.out.print("("+arr1[i][j]+"," + arr1[j][j]+")");

			}
			System.out.println("");
			
		}
	}
	public void practice2() {
		int[][] arr = {{1,2,3,4},{5,6,7,8,},{9,10,11,12},{13,14,15,16}};
	
		for (int i =0; i<arr.length; i++) {
			for(int j=0; j< arr[i].length; j++) {
				System.out.print(arr[i][j]+" ");
				}System.out.println("");
		}
	}
	
	
	public void practice3() {
		int[][] arr = {{1,2,3,4},{5,6,7,8,},{9,10,11,12},{13,14,15,16}};
		
		for (int i = arr.length-1 ; i>=0; i--) {
			for(int j = arr[i].length-1; j>=0 ; j--) {
				System.out.print(arr[i][j]+" ");
				}System.out.println("");
		}
	}
	
	

}
