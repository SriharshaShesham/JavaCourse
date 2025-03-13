import java.util.Scanner;

public class Functions {
	// Global Declaration
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Program();

	}

	public static String GetInputFomUser() {
		String userInput;
		userInput = sc.nextLine();
		return userInput;
	}

	public static int GetIntFomUser() {
		int userInput;
		userInput = sc.nextInt();
		return userInput;
	}

	public static void PrintLine() {
		System.out.println("------------------------------------------------");
	}

	public static void Program() {
		PrintLine();
		System.out.println("Functions InDepth");
		PrintLine();
		String firstName, lastName, dob;
		int age;
		System.out.println("Enter First Name: ");
		firstName = GetInputFomUser();
		System.out.println("Enter Last Name: ");
		lastName = GetInputFomUser();
		System.out.println("Enter Date of birth: ");
		dob = GetInputFomUser();
		System.out.println("Enter age: ");
		age = GetIntFomUser();

		// Output goes here
		System.out.println("Firstname is : "+firstName);
	}
}
