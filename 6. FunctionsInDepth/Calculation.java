import java.util.Scanner;

public class Calculation {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Program();
	}

	public static void Program() {
		int userSelection;
		UserScreen("Calculation");
		userSelection = UserPrompt();

		if (userSelection == 1) {
			// Addition
			Addition();
		}
		if (userSelection == 2) {

			// Substraction();
		}

	}

	public static void Addition() {
		int num1, num2, result;
		UserScreen("Addition");
		System.out.println("Enter first number");
		num1 = GetNumberFromUser();
		System.out.println("Enter the second number");
		num2 = GetNumberFromUser();
		result = SumOfTwoNumbers(num1, num2);
		UserScreen("Sum of two numbers is: " + result);
		ScreenBreak();
	}

	public static int SumOfTwoNumbers(int firstNumber, int secondNumber) {
		int output;
		output = firstNumber + secondNumber;
		return output;
	}

	public static int GetNumberFromUser() {
		int inputFromUser;
		inputFromUser = sc.nextInt();
		return inputFromUser;
	}

	public static void UserScreen(String screenTitle) {
		System.out.println("---------------------------------------------------");
		System.out.println(screenTitle);
		System.out.println("---------------------------------------------------");
	}

	public static void ScreenBreak() {
		System.out.println();
		System.out.println(
				"------------------------------------------------------------------------------------------------------");
		System.out.println();
	}

	public static int UserPrompt() {
		int userChoice;
		System.out.println("1. Addition");
		System.out.println("2. Substraction");
		System.out.println("3. Multiplication");
		System.out.println("4. Division");
		System.out.println("What Calculation do you want to perform? Please select corresponding number from above:");
		// userChoice=sc.nextInt();
		userChoice = GetNumberFromUser();
		return userChoice;
	}

	/*
	 * Function
	 * Input ->?
	 * 
	 * Return ->?
	 */

}
