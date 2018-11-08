package emailapp;

import java.util.Scanner;

public class Email {
	
	// Encapsulate to avoid alteration by outsiders
	
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 10;
	private String department;
	private String email;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String companySuffix = "abc.com";
	
	// Constructor to receive firstName and lastName
	// Constructor is set as nameOfClass i.e, Email
	
	public Email(String firstName, String lastName){
		this.firstName = firstName;
		this.lastName = lastName;
		
		System.out.println("Your Name: " + this.firstName + " " + this.lastName);
		
		// Call a method asking for department and return the output
		this.department = setDepartment();
//		System.out.println("Department: " + this.department);
		
		// Call a method that returns a random password
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your Password: " + this.password);
		
		// Combine elements to generate email
		email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
//		System.out.println("Your Email is: " + email);
		
	}
	
	// Ask for department
	private String setDepartment(){
		
		System.out.println("Department Codes:");
		System.out.println("1 Sales");
		System.out.println("2 Development");
		System.out.println("3 Accounting");
		System.out.println("0 None");
		System.out.print("Enter the Department code: ");
		
		Scanner in = new Scanner(System.in);
		int deptChoice = in.nextInt();
		
		if(deptChoice == 1){
			return "sales";
		}
		else if(deptChoice == 2){
			return "dev";
		}
		else if(deptChoice == 3){
			return "accounting";
		}
		else{
			return "";
		}
	}
	
	// Generate random password
	private String randomPassword(int length){
		String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890!@#$%^&*()";
		char[] password = new char[length];
		
		for(int i = 0; i<length; i++){
			int ind = (int)(Math.random() * passwordSet.length());
			password[i] = passwordSet.charAt(ind);
		}
		return new String(password);		
	}
	
	// Get and Set method to avoid direct communicating with the variables
	
	// Set mailboxCapacity
	public void setMailboxCapacity(int capacity){
		this.mailboxCapacity = capacity;
	}
	
	// Set alternateEmail
	public void setAlternateEmail(String altEmail){
		this.alternateEmail = altEmail;
	}
	
	// Change password
	public void changePassword(String password){
		this.password = password;
	}
	
	public int getMailboxCapacity(){
		return mailboxCapacity;
	}
	public String getAlternateEmail(){
		return alternateEmail;
	}
	public String getPassword(){
		return password;
	}
	
	public String showInfo(){
		return "Display Name: " + firstName + " " + lastName +
				"\nCompany Email: " + email +
				"\nMailBox Capacity: " + mailboxCapacity;
	}
}
