import java.util.Scanner; //Ramaynam

public class IO {
	public static void main(String[] args) {
		program();
	}

	public static void program() {
		int userEnteredFirstNumber; // declare
		float userEnteredSecondNumber; // declare
		String userEnteredProgramName;
		// int userEnteredNumber=12; //initialization
		Scanner scanner = new Scanner(System.in);

		System.out.println("Give your program a name:");
		userEnteredProgramName = scanner.nextLine();

		System.out.println("----------------------------------------------");
		System.out.println("         " + userEnteredProgramName + "             ");
		System.out.println("----------------------------------------------");

		System.out.println("Enter first number");
		userEnteredFirstNumber = scanner.nextInt();
		System.out.println("Enter second number");
		userEnteredSecondNumber = scanner.nextFloat();

		float result = userEnteredSecondNumber * userEnteredFirstNumber;

		System.out.println("Product of two numbers is: " + result);

		// convert the result to percentage
		System.out.println("Product percent is: " + (result) / 100);
	}
}
