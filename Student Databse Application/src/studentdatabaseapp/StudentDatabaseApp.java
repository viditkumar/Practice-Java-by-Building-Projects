package studentdatabaseapp;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
		
		// Ask number of new users
		System.out.print("Enter the number of new Students: ");
		Scanner in = new Scanner(System.in);
		int numOfStud = in.nextInt();
		
		Student[] students = new Student[numOfStud];
		
		// Create n number of new students
		for(int i = 0; i<numOfStud; i++){
			students[i] = new Student();
			students[i].enroll();
			students[i].payTuition();
			System.out.println(students[i].showInfo());
			
		}

	}

}
