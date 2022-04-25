package com.javaex.ex06;

import java.util.Scanner;

public class CConverterApp {

    public static void main(String[] args) {
    	
    	Scanner sc = new Scanner(System.in);
    	
        double dollar;	// static필드 선에서 정리되는데 메소드를 이용?
        double won;		
        
        CConverter.setRate(1118.70);
        
        //100만원을 달러로 출력하기
        System.out.print("금액 입력(원) : ");
        won = sc.nextDouble();
        System.out.println("백만원은 " + CConverter.toDoller(won) + "달러입니다.");
        
        //100달러를 원으로 출력하기
        System.out.print("금액 입력(달러) : ");
        dollar = sc.nextDouble();
        System.out.println("백달러는 " + CConverter.toKWR(dollar) + "입니다.");
        
        sc.close();
    }

}
