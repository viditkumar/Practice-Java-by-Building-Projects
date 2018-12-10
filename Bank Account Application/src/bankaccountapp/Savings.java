package bankaccountapp;

public class Savings extends Account{
	
	//  list the properties
	private int safetyDepositBoxID;
	private int safetyDepositBoxKey;	
	
	// constructor to initialize savings.java properties
	public Savings(String name, String sSN, double initDeposit){
		super(name, sSN, initDeposit);
		accountNumber = "1" + accountNumber;
		
//		System.out.println("Account Number: " + this.accountNumber);
//		System.out.println("Savings account created");
		
		setSafetyDepositBox();
	}
	
	@Override
	public void setRate() {
		rate = getBaseRate()-0.25;
		
	}
	
	private void setSafetyDepositBox(){
		safetyDepositBoxID = (int)(Math.random() * Math.pow(10, 3));
		safetyDepositBoxKey = (int)(Math.random() * Math.pow(10, 4));
	}
	// list methods
	public void showInfo(){
//		System.out.println("Account Type: Savings");
		super.showInfo();
		// without the above super class, the method gets overridden with the method written
		// in account.java
		// writing super.showInfo(), calls method in super class first and then the current class
		
		System.out.println(
				"Your Savings Account Features" + 
				"\n Safety Deposit Box ID: " + safetyDepositBoxID +
				"\n Safety Deposit Box Key: " + safetyDepositBoxKey
				);
	}
}
