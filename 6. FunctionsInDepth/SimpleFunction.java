import java.util.Scanner;

public class SimpleFunction {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String testStr = "Test";
		PrintString(testStr, "Another one for next line");
		PrintString("Sriharsha", "Shesham");

		int number;
		number = GetNumberFromUser();
		System.out.println(number);
	}

	public static void PrintString(String stringToPrint, String stringToPrintInNextLine) {
		System.out.println(stringToPrint);
		System.out.println(stringToPrintInNextLine);
	}

	public static int GetNumberFromUser() {
		int inputFromUser;
		System.out.println("Enter a number");
		inputFromUser = sc.nextInt();
		return inputFromUser;
	}
}
