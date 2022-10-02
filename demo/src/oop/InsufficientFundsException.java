package oop;

public class InsufficientFundsException extends Exception {
	  private double amount, balance;
      public InsufficientFundsException(double balance, double amount) {
    	  this.balance = balance;
    	  this.amount = amount;
      }
      
      public String toString() {
    	  return "Insufficient funds " + this.balance  +
    	  		 " for withdraw of " + this.amount; 
      }
      
      public String getMessage() {
    	  return toString();
      }
}
