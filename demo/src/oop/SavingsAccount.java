package oop;

public class SavingsAccount {
	// Instance variables	
	private int acno;
	private String ahname;
	private double balance;

	// Constructor
	public SavingsAccount(int acno, String ahname) {
		this.acno = acno;
		this.ahname = ahname;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
	}
	
	public void withdraw(double amount) {
		this.balance -= amount;
	}
	
	public double getBalance() {
		return this.balance;
	}
}
