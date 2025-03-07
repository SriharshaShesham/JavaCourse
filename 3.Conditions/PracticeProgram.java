/*
 * User Registration and login Form
-----------------------

Collect user details as below:
----------------------------
Firstname string
Lastname string
Password:
Confirm Password:



Login form
----------
username
password 

if user password entered is same as password entered during registration, then show the message "Welcome to the page". Else enter "Wrong information".
 * 
 * 
 */

import java.util.Scanner;

public class PracticeProgram {
	public static void main(String[] args) {

		
		Program();
	}

	public static void Program() {
		String Firstname;
		String Lastname;
		String Username;
		String Password;
		String UsernameAtLogin;
		String PasswordAtLogin;
		String ConfirmPassword;

		Scanner sc = new Scanner(System.in);

		System.out.println("----------------------------------");
		System.out.println("User Registration and login Form");
		System.out.println("----------------------------------");

		System.out.println("Enter FristName: ");
		Firstname = sc.next();
		System.out.println("Enter LastName: ");
		Lastname = sc.next();
		System.out.println("Enter UserName: ");
		Username = sc.next();
		System.out.println("Enter Password: ");
		Password = sc.next();
		System.out.println("Enter Confirm Password: ");
		ConfirmPassword = sc.next();

		System.out.println("----------------------------------");
		System.out.println("User Login Form");
		System.out.println("----------------------------------");

		System.out.println("Enter UserName: ");
		UsernameAtLogin = sc.next();

		System.out.println("Enter Password: ");
		PasswordAtLogin = sc.next();

		if (Username.equals(UsernameAtLogin) && Password.equals(PasswordAtLogin)) {
			System.out.println("Welcome to the page");
		} else {
			System.out.println("Invalid credentials entered. Please try again...");
		}

	}
}
