package com.EndTermExamApellido;
import javax.swing.JOptionPane;

public class TestAccount {
	public static void main(String[] args){
		Checking aCheckingAccount = new Checking(1);
		Savings aSavingsAccount = new Savings(3, 1.9);
		
		JOptionPane.showMessageDialog(null, aCheckingAccount.getAccountInfo());
		JOptionPane.showMessageDialog(null, aSavingsAccount.getAccountInfo());
	}
}
