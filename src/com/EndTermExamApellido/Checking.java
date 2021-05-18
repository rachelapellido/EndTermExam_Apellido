package com.EndTermExamApellido;

public class Checking extends AccountForABank {
	
	public Checking(int accountNumber){
		super(accountNumber);
}
	
	public int getAccountNumber(){
		
		return accountNumber;
}
	
	public double getBalance(){
		
		return balance;
}
	
	public String getAccountInfo()
{
		return("Checking Account Information\nAcct Num: " + getAccountNumber() + "\nBalance: " + getBalance());
	}
}
