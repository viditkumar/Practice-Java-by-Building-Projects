package bankaccountapp;

import java.util.LinkedList;
//import Utilities.*; // This also works, if you want to import specific class only
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Account> accounts = new LinkedList<Account>();
		
		
//		Checking chkacc1 = new Checking("John", "123456789", 1500);
//		
//		Savings svgacc1 = new Savings("Walter", "987654321", 1200);
//		
//		chkacc1.showInfo();
//		svgacc1.showInfo();
//		
//		svgacc1.deposit(5000);
//		svgacc1.compound();
		
		// read csv file, create new accounts based on that
		String file = "E:\\Practice Java by Building Projects\\Practice-Java-by-Building-Projects\\NewBankAccounts.csv";
		List<String[]> newCustomers = Utilities.CSV.read(file);
		
		for(String[] customers : newCustomers){
//			System.out.println("New Accounts");
			String name = customers[0];
			String sSN = customers[1];
			String accountType = customers[2];
			double initDeposit = Double.parseDouble(customers[3]);
//			System.out.println(name + " " + sSN + " " + accountType + " " + initDeposit);
			
			if(accountType.equals("Savings")){
//				System.out.println("Open a Savings Account");
				accounts.add(new Savings(name, sSN, initDeposit));
			} else if(accountType.equals("Checking")){
//				System.out.println("Open a Checking Account");
				accounts.add(new Checking(name, sSN, initDeposit));
			} else{
				System.out.println("Error reading Account Type");
			}
		}
		
		for(Account acc: accounts){
			acc.showInfo();
		}
	}
}
