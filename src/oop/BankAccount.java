package oop;

public class BankAccount implements IRate {
	
	// Static variable
	private static final String routingNumber = "012435";
	
	// Instance variables
	String accountNumber;
	private String name;
	String ssn;
	String accountType;
	double balance;

	
	BankAccount() {
		System.out.println("New Account Created");
	}
	
	BankAccount(String accountType) {
		System.out.println("New Account: " + accountType);
	}
	
	BankAccount(String accountType, double initDeposit) {
		// initDeposit, accountType, Msg are all local variables
		System.out.println("New Account: " + accountType);
		System.out.println("Initial Deposit of:  $" + initDeposit);
		String Msg = null;
		if (initDeposit < 1000) {
			Msg = "ERROR: Minimum deposit must be at least $1,000";
		} else {
			Msg = "Thanks for your initial deposit of: $" + initDeposit;
		}
		System.out.println(Msg);
		balance = initDeposit;
	}
	
	// Getters/Setters
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setRate() {
		System.out.print("Set");
	}
	
	public void increaseRate() {
		System.out.print("Hello World");
	}
	
	public void deposit(double amount) {
		balance = balance + amount;
		showActivity("DEPOSIT");
	}
	
	void withdraw(double amount) {
		balance = balance - amount;
		showActivity("WITHDRAW");
	}
	
	// Private: can only be called from within the class
	private void showActivity(String activity) {
		System.out.println("Show recent activity: " + activity);
		System.out.println(balance);
	}
	
	
	void checkBalance() {
		System.out.println("Balance: " + balance);
		
	}
	
	void getStatus() {
		
	}
	
	@Override
	public String toString() {
		return "[" + name + ". " + accountNumber + ". Balance: $" + balance + " ]";
	}

}
