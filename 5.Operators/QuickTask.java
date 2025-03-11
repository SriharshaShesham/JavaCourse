import java.util.Scanner;

import javax.print.attribute.standard.PrinterMessageFromOperator;

public class QuickTask {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Program();
	}

	public static void Program() {
		int firstNumber;
		int secondNumber;
		int greatestNumber;
		int difference;
		PrintLine();
		System.out.println("Program to find difference between two numbers");
		PrintLine();

		System.out.println("Enter first number");
		firstNumber = sc.nextInt();
		System.out.println("Enter second number");
		secondNumber = sc.nextInt();
		if (firstNumber > secondNumber) {
			greatestNumber = firstNumber;
			difference = firstNumber - secondNumber;
		} else {
			greatestNumber = secondNumber;
			difference = secondNumber - firstNumber;
		}

		PrintLine();
		System.out.println("Output");
		// Output
		PrintLine();
		System.out.println("The greatest of two numbers is: " + greatestNumber);
		System.out.println("The difference between two numbers is: " + difference);

	}

	public static void PrintLine() {
		System.out.println("-------------------------------------------------------------");
	}
}
