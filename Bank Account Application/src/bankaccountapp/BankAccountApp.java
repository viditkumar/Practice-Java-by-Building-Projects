package bankaccountapp;

public class BankAccountApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Checking chkacc1 = new Checking("John", "123456789", 1500);
		
		Savings svgacc1 = new Savings("Walter", "987654321", 1200);
		
		chkacc1.showInfo();
		System.out.println("***********************");
		svgacc1.showInfo();
		
//		svgacc1.deposit(5000);
		svgacc1.compound();
		
		// read csv file, create new accounts based on that
		

	}

}
