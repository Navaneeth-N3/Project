package com.pack2;

class BankAccount
{
	private int balance;

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}

public class Tester2 {

	public static void main(String[] args) {
		BankAccount ba = new BankAccount();
		//System.out.println(ba.bankBalance);
		System.out.println(ba.getBalance());
		
		ba.setBalance(8000);
		System.out.println(ba.getBalance());

	}

}
