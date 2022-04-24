package com.javaex.ex07;

public class Friend {
	
	// 필드
    private String name;
    private String hp;
    private String school;
    
    
    // 생성자
    
    Friend(){}
    
    Friend(String name, String hp, String school){
    	this.name = name;
    	this.hp = hp;
    	this.school = school;
    }
    
    // 메소드 getter/setter
    public String getName() {
		return name;
	}

	public String getHp() {
		return hp;
	}

	public String getSchool() {
		return school;
	}
    
    // 메소드 일반
	
	public void name(String name) {
		this.name = name;
	}
	
	public void hp(String hp) {
		this.hp = hp;
	}
	
	public void school(String school) {
		this.school = school;
	}
	
	
    public void showInfo(){
        System.out.println("이름:"+ name + " 핸드폰:" + hp + " 학교:" + school);
    }

}
