package oop;

public class SavingsAccount {
	// Instance variables	
	private int acno;
	private String ahname;
	private double balance;

	// Constructor
	public SavingsAccount(int no, String name) {
		acno = no;
		ahname = name;
	}
	
	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
	
	public double getBalance() {
		return balance;
	}
}
