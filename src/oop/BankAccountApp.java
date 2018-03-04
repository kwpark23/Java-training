package oop;

public class BankAccountApp {
	public static void main(String[] args) {
		
		BankAccount acc1 = new BankAccount();
		acc1.accountNumber = "023424";
		//acc1.name = "Roger";
		acc1.setName("Roger");
		
		System.out.println(acc1.getName());
		acc1.balance = 10000;
		acc1.deposit(1500);
		acc1.withdraw(2000);
		
		System.out.println(acc1.toString());
		
		BankAccount acc2 = new BankAccount("Checking Account");
		acc2.accountNumber = "435343";
		
		BankAccount acc3 = new BankAccount("Savings Account", 5000);
		acc3.accountNumber = "987984";
		acc3.checkBalance();
		
		CDAccount cd1 = new CDAccount();
		cd1.balance = 3000;
		cd1.interestRate = "4.5";
		cd1.name = "Helio";
		cd1.accountType = "CD Account";
		System.out.println(cd1.toString());
		cd1.compound();
	
	} 
}
