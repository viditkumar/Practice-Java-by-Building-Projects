package bankaccountapp;

public abstract class Account implements IBaseRate {
	// abstract here will mean, we will not be able to create objects from account.java class
	// but we can create objects in classes that inherit account.java
	
	// here account.java is parent of savings.java and checking.java
	
	// List common properties for savings and checking accounts
	
	// constructor to set base properties and initialize the account
	public Account(String name){
		System.out.println("Name: " + name);
		System.out.print("New Account: ");
	}
	// list common methods
	
	
}
