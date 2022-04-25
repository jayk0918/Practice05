package com.javaex.ex09;

public class StringUtil {
    
    public static String concatString(String[] str){	// 배열 합성
       
        //메소드 내용작성
    	
    	String strAttach = str[0];	// String 변수 선언 + 0번째 배열에서부터 시작
    	
    	for(int i=1; i<str.length; i++) {	// i가 0부터 시작이므로 1번째 i값부터 +
    		strAttach += str[i];	// for문으로 반복 적용 (length제한) + 0번째부터 새로운 String 변수에 +
    	}
    	
    	return strAttach;	//String 값 return
    	
        
    	
    }

}
