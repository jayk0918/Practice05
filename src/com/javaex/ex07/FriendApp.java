package com.javaex.ex07;

import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        Friend[] friendArray = new Friend[3];
        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("친구를 3명 등록해 주세요");
        
        for (int i = 0; i < friendArray.length; i++) {
        	System.out.print("이름: ");
        	friendArray[i].name(sc.nextLine()); // name (String name)을 호출하는데, (String name)자리에 sc.nextLine()을 대입
        	System.out.print("핸드폰: ");
        	friendArray[i].hp(sc.nextLine());
        	System.out.print("학교: ");
        	friendArray[i].school(sc.nextLine());
        	System.out.println("-------------------------");
        }
        
        for (int i = 0; i < friendArray.length; i++) {
        	friendArray[i].showInfo();
        }
        
        sc.close();
    }

}
