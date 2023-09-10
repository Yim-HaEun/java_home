package com.kh.practice.chap01_poly.model.vo;

public class CookBook {
	private boolean coupon; //요리학원 쿠폰 유무 
	
	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
	public boolean isCoupon() {
		return coupon;
	}
	
	public CookBook() {
		
	}
	public CookBook(String title, String author, String publisher, boolean coupon) {
		
	}
	@Override
	public String toString() {
		return super.toString();
	}

}
