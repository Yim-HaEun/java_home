package com.kh.example.practice5.model.vo;
import java.util.Random;

public class Lotto {
	//초기
	private int[] lotto = new int[6];
	
	public int[] getLotto() {
		return lotto;
	}
	public void setLotto(int[] lotto) {
		this.lotto = lotto;
	}
	public Lotto() {
		
	}
	public void information() {
		//Random random = new Random();
		
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = (int)(Math.random()*45+1); // 로또 번호 넣어주기 
			System.out.println(" "+ lotto[i]); //번호 출력 
			
		}
	}

		
}
