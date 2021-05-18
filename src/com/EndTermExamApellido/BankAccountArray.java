package com.EndTermExamApellido;

public class BankAccountArray {
	public static void main(String[] args){
		AccountForABank[] accountArray = new AccountForABank[10];
		
		accountArray[0] = new Checking(2);
		accountArray[1] = new Checking(8);
		accountArray[2] = new Checking(11);
		accountArray[3] = new Checking(20);
		accountArray[4] = new Checking(15);
		accountArray[5] = new Savings(26, 2.0);
		accountArray[6] = new Savings(27, 2.1);
		accountArray[7] = new Savings(28, 3.2);
		accountArray[8] = new Savings(29, 1.3);
		accountArray[9] = new Savings(30, 4.4);
		
		for(int i = 0; i < accountArray.length; ++i)
			System.out.println(accountArray[i].getAccountInfo() + "\n");
	}
}
