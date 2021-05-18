package com.EndTermExamApellido;

public abstract class AccountForABank {
	
	protected int accountNumber;
	protected double balance;
	
	public AccountForABank (int num)
{
		accountNumber = num;
		setBalance(0.0);
	}
	
	public void setBalance(double bl)
{
		balance = bl;
	}
	
	public abstract int getAccountNumber();
	public abstract double getBalance();
	
	
	public abstract String getAccountInfo();

}
