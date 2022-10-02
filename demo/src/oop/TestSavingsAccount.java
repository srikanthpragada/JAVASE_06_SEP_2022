package oop;

public class TestSavingsAccount {

	public static void main(String[] args) {
		 SavingsAccount s = new SavingsAccount(1, "Steve");
		 s.deposit(10000);
		 
		 SavingsAccount s2 = new SavingsAccount(2, "Tom");
         s2.deposit(10000);
         try {
			s2.withdraw(20000);
		} catch (InsufficientFundsException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
         System.out.println(s2.getBalance());
         
         System.out.println(10);

	}

}
