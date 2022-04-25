package com.javaex.ex08;

public class Account {
	
	// 필드
	
    private String accountNo;
    private int balance;
    
    //생성자 작성
    
    public Account() {}
    
    public Account(String accountNo) {
    	this.accountNo = accountNo;
    }
    
    //메소드 gs
    
    public String getAccountNo() {
		return accountNo;
	}

	public int getBalance() {
		return balance;
	}

    //메소드 일반
    
    public void deposit(int deposit) {
    	this.balance += deposit;
    }
    
    public void withdraw(int withdraw) {
    	this.balance -= withdraw;
    }
    
    public void showBalance() {
    	System.out.println(balance);
    }
    

}
