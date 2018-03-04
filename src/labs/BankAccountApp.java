package labs;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount acc1 = new BankAccount("243432423", 1000);
		
		acc1.setName("Jin Park");
		System.out.println(acc1.getName());
		acc1.makeDeposit(500);
		acc1.makeDeposit(600);
		acc1.payBill(50);
		acc1.accrue();
		System.out.println(acc1.toString());
	}

}

class BankAccount implements Iinterest {
	// Properties of bank account
	private static int ID = 1000;
	private String accountNumber; // ID + random 2 digit number + first 2 of SSN
	private static final String routingNumber = "0234334";
	private String name;
	private String SSN;
	private double balance;
	
	// Constructor
	public BankAccount (String SSN, double initDeposit) {
		balance = initDeposit;
		this.SSN = SSN;
		ID++;
		setAccountNumber();
	}
	
	private void setAccountNumber() {
		int random = (int)(Math.random() * 100);
		accountNumber = ID + "" + random + SSN.substring(0, 2);
		System.out.println("Your Account Number: " + accountNumber);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void payBill(double amount) {
		balance = balance - amount;
		System.out.println("Paying bill: " + amount);
		showBalance();
	}
	
	public void makeDeposit(double amount) {
		balance = balance + amount;
		System.out.println("Making deposit: " + amount);
		showBalance();
	}
	
	public void showBalance() {
		System.out.println("Balance: " + balance);
	}

	@Override
	public void accrue() {
		balance = balance * (1 + rate/100);
		showBalance();
	}
	
	@Override
	public String toString() {
		return "[Name: " + name + " ]\n{Account Number: " + accountNumber + "]\n" + "[Routing Number:" + routingNumber + "]\n" + "[Balance: " + balance + "]";
	}
	

}