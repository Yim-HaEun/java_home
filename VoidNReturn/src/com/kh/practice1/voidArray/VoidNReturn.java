package com.kh.practice1.voidArray;


import java.util.Random;
import java.util.Scanner;
/*
 * System.out.println();
 * void 활용
 * return 활용
 * static
 * */
public class VoidNReturn {
	public void practice1() {
		//두 수의 합 계산
		 Scanner scanner = new Scanner(System.in);
	       
	        int num1 = scanner.nextInt();
	       
	        int num2 = scanner.nextInt();

	        int sum = num1 + num2;
	        
	    }
	public void practice2() {
		Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
	}
    public void practice3() {
  		 Scanner scanner = new Scanner(System.in);
  	       
  	     String input = scanner.nextLine();

  	     String reversed = new StringBuilder(input).reverse().toString();
  	       
  	}
    public void practice4() {
		Scanner scanner = new Scanner(System.in);
       
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        int sum = 0;

       
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
    }
    public void practice5() {
		Scanner scanner = new Scanner(System.in);
	       
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];

       
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
    }
    public void practice6() {
		Scanner scanner = new Scanner(System.in);
        
        int num = scanner.nextInt();
        
        boolean isPrime = isPrimeNumber(num);
        
        if (isPrime) {
          
        } else {
           
        }
    }
    public  boolean isPrimeNumber(int num) {
        if (num <= 1) {
            
        }
        
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
               
            }
        }
		return false;
	
        
        
	}
   //public void practice7() {
    	//계산기 만들기 (연산 결과 반환):
		
    	//메서드 이름: calculate
    public void calculate() {
    	double num1;
    	double num2; 
    	String operator;
    	double result = 0;
    	System.out.println("값과  연산자를 입력하세요.");
    	Scanner scan = new Scanner(System.in);
    	System.out.print("num1 : ");
    	num1 = scan.nextDouble();
    	System.out.print("num2 : ");
    	num2 = scan.nextDouble();
    	System.out.print("연산자 : ");
    	operator = scan.next();
    	
    	
    	if(operator == "+") {
    		result = num1+num2;
    	}else if(operator == "-") {
    		result = num1-num2;
    	}else if(operator == "*") {
    		result = num1*num2;
    	}
    	else if(operator == "/") {
        	result = num1/num2;
    	}else {
    		result =0;
    	}
    	System.out.println(result);	
    }
		
    	//매개변수: 두 개의 실수(double 타입) num1과 num2, 그리고 연산자(String 타입) operator
		//기능: num1과 num2를 operator에 따라 더하기, 빼기, 곱하기, 나누기 연산을 수행하고 결과를 반환함.

   // public practice8() {
	/*
	단어 개수 세기:
	
	메서드 이름: countWords
	
	매개변수: 문자열(String 타입) text
	기능: 입력된 문자열에서 공백을 기준으로 단어의 개수를 세고 결과를 출력함(void 리턴 타입).
	
	*/
	public void countWords() {
		String text;
		int count = 0;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("문자열을 입력하세요. ");
		text = scan.nextLine();
		for(int i =0; i<text.length();i++) {
			if(text.charAt(i) == ' ') { //공백을 만날때마
				count++; //	단어로 간주해 개수를 센
			}
		}
		count++; //마지막 단어도 포함해줌 
		System.out.println("단어는 "+count+"개 입니다.");
	}
    	

    
    //public practice9() {
    	/*
    	삼각형 별 출력:

    	메서드 이름: printTriangle

    	매개변수: 양의 정수(int 타입) height
    	기능: 높이가 height인 삼각형 모양의 별을 출력함(void 리턴 타입).
    	
    */
	public void printTriangle() {
		int height;
		Scanner scan = new Scanner(System.in);
		System.out.print("높이를 입력하세요 : ");
		height = scan.nextInt();
		
		for(int i =0; i<=height; i++) {
			for(int a = height; a<=i; a--) { //별 출력 전 공
				System.out.print(" ");
			}
			for(int b= 1; b<=i; b++) {//삼각형 반쪽(왼)
				System.out.print("*");
			}
			for(int c =2; c<=i; c++) {//삼각형 반쪽 (오)
				System.out.print("*");
			}
			System.out.println(); //줄 바
			
		}

    }
    //public practice10() {
    	/*
    	로또 번호 생성기:
    	Random
    	메서드 이름: generateLottoNumbers

    	매개변수: 로또 번호의 개수(int 타입) count
    	기능: 중복되지 않는 무작위 로또 번호를 count만큼 생성하여 출력함(void 리턴 타입).
    */
	public void generateLottoNumbers() {
		int[] count = new int[6];
		//Random r = new Random();

		for(int i=0; i<count.length; i++) {
			count[i] = (int)(Math.random()*45+1);
			for (int j=0;j<i;j++) { 
				if(count[i] ==count[j]) { //중복
					i--;
					break; //중복이면 i를 한번 더돌림.
				}
			}
			System.out.print(count[i]+ " ");
				
			}
		
    }
	
	
}
    
        
        
    
       
