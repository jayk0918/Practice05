package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args){
		
		Song s1 = new Song("좋은날", "아이유", "Real", "이민수", "2010", 3);
		
		System.out.println(s1); // 노란색 경고 방지용 -> 주소값 나올 것임
		
		// 예상해보기
		
		// (title, artist, album, composer, year(String형태), track(int)가 서술됨
		// int track이 정의된 '파라미터 6개'생성자가 취사적용되었을 것이다.
		// 단, 현재 정리된 선택자로는 파라미터에 대한 정보만 출력될 것이기 때문에
		// 만약 artist 등으로 정의한 정보를 추가로 출력하고자 한다면 print에 대한 추가 정의 작업이 필요할 것이다.
		
		// 결과정리
		// 파라미터 6개 생성자가 적용되어 출력을 예상한 것까지는 OK, 그러나 5개짜리 생성자로부터 인용되었기에 파라미터 5개도 출력된다는 것을 잊음
	
		
		
	}

}


