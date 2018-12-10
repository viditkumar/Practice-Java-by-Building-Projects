package bankaccountapp;

public class Checking extends Account{
	// superclass gets called first in the construtor 
	
	//  list the properties
	private int debitCardNumber;
	private int debitCardPIN;
	
	
	// constructor to initialize checking.java properties
	public Checking(String name, String sSN, double initDeposit){
		super(name, sSN, initDeposit);
		accountNumber = "2" + accountNumber;
		
//		System.out.println("Account Number: " + this.accountNumber);
//		System.out.println("Checking account created");
		
		setDebitCard();
	}
	
	public void setRate(){
		rate = getBaseRate()*0.15;
	}
	
	private void setDebitCard(){
		debitCardNumber = (int)(Math.random() * Math.pow(10, 12));
		debitCardPIN = (int)(Math.random() * Math.pow(10, 4));
	}
	
	// list methods
	public void showInfo(){
//		System.out.println("Account Type: Checking");
		super.showInfo();
		// without the above super class, the method gets overridden with the method written
		// in account.java
		// writing super.showInfo(), calls method in super class first and then the current class
		
		System.out.println(
				"Your Checking Account Features" + 
				"\n Debit Card Number: " + debitCardNumber +
				"\n Debit Card PIN: " + debitCardPIN
				);
		
	}
}
