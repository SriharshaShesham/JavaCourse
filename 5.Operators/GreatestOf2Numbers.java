import java.util.Scanner;

// Less than and greater than operators
// Global variables
// Local variable
public class GreatestOf2Numbers // Pascal Case
{
	static Scanner scanner; // Declaration -> scanner -> Scanner -> allocates memory

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		Program();
		GetTestInputFromUser();
	}

	public static void PrintLine() {
		System.out.println("--------------------------------------------------");
	}

	// Portion 2
	public static void GetTestInputFromUser() {
		System.out.println("Function -> GetTestInputFromUser()");
		int number;

		System.out.println("Enter a number");
		number = scanner.nextInt();
		System.out.println("User entered number is : " + number);
	}

	// Portion 1
	public static void Program() // Pascal Case
	{
		System.out.println("Function -> Program()");
		int firstNumber;// camel case
		int secondNumber;// camel case
		String programName;

		PrintLine();
		programName = "Greatest of 2 numbers";
		PrintLine();
		System.out.println("Enter first number");
		firstNumber = scanner.nextInt();
		System.out.println("Enter second number");
		secondNumber = scanner.nextInt();

		if (firstNumber != secondNumber) {
			if (firstNumber > secondNumber) // 10 > 10
			{
				System.out.println(firstNumber + " is greater");
			} else {
				System.out.println(secondNumber + "is greater");
			}
			// Same can be writter using the less than symbol
			if (firstNumber < secondNumber) {
				System.out.println(secondNumber + "is greater");
			} else {
				System.out.println(firstNumber + " is greater");
			}
		} else {
			System.out.println("Both the numbers are same");
		}

	}

}
