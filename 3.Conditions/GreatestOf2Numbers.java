import java.util.Scanner;

// Global variables
// Local variable
public class GreatestOf2Numbers // Pascal Case
{
	static Scanner scanner; // Declaration -> scanner -> Scanner -> allocates memory

	public static void main(String[] args) {
		scanner = new Scanner(System.in);
		Program();
		String name = "Rama";
	}

	public static void Program() // Pascal Case
	{
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

			if (firstNumber < secondNumber) {
				System.out.println(secondNumber + "is greater");
			} else {
				System.out.println(firstNumber + " is greater");
			}
		} else {
			System.out.println("Both the numbers are same");
		}

	}

	public static void PrintLine() {
		System.out.println("--------------------------------------------------");
	}
}
