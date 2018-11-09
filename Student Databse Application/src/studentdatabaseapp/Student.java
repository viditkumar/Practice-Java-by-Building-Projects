package studentdatabaseapp;

import java.util.Scanner;

public class Student {
	
	private String firstName;
	private String lastName;
	private int gradeYear;
	private String studentID;
	private String courses;
	private int tuitionBalance = 0;
	private static int costOfCourse = 600;
	private static int id = 1000;
	
	// Constructor: prompt user to enter name and year
	public Student(){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter First Name: ");
		this.firstName = in.nextLine();
		
		System.out.print("Enter Last Name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1 - Freshmen\n2 - Sophomore\n3 - Senior\nEnter Grade Level: ");
		this.gradeYear = in.nextInt();
		
		setStudentID();
//		System.out.println(firstName + " " + lastName + " " + gradeYear + " " + studentID);
	}
	
	// Generate ID
	private void setStudentID(){
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	// Enroll in courses
	public void enroll(){
		
		do{
			System.out.print("Enter a course to enroll, and Q to Quit");
			Scanner in = new Scanner(System.in);
			String course = in.nextLine();
			
			if(!course.equals("Q")){
				courses = courses + "\n " + course;
				tuitionBalance += costOfCourse;
			}
			else{
				break;
			}
		}
		while(1!=0);
		
//		System.out.println(courses);
	}
	
	// View balance
	public void viewBalance(){
		System.out.println("Balance: " + tuitionBalance);
	}
	
	// Pay tuition
	public void payTuition(){
		
		viewBalance();
		System.out.print("Enter the payment amount: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		
		tuitionBalance -= payment;
		System.out.println("Thank you for the payment!");
		viewBalance();
	}
	
	// Show status
	public String showInfo(){
		return "Name: " + firstName + " " + lastName +
				"\nStudent ID: " + studentID +
				"\nCourses: " + courses +
				"\nBalance: " + tuitionBalance;
	}	
}
