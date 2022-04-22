package com.javaex.ex02;

public class Goods {
	
	// 필드
	private String name;
	private int price;
	
	// 생성자
	public Goods() {}; // <- 오류 원인
	// 이유 : 기본생성자는 로직을 가진 다른 생성자가 없을때는 생략이 가능하다.
	// 그러나 로직을 가진 다른 생성자가 단 하나라도 있을 경우에는 기본생성자는 삭제된다.
	// GoodsApp에서 camera는 생성자 로직을 사용하지 않고 기본생성자 로직으로 작성되었으나 기본생성자는 이미 삭제되었기에 오류가 발생한다.
	// 따라서 기본생성자는 특히나 다른 생성자가 존재한다고 했을 때는 반드시 서술해주어야 한다.
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// 메소드 gs
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	// 메소드 - 일반
	
	public void showInfo() {
		System.out.println("상품명: " + name + ", 가격:" + price);
	}
	
}




