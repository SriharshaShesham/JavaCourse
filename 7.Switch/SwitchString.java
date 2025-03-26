import java.util.Scanner;

public class SwitchString {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Program();
	}

	public static void Program() {
		String person;
		System.out.println("Please choose the person: Arjuna or Karna");
		person = sc.next();

		switch (person) {
			case "Arjuna": {
				System.out.println("Pros:");
				System.out.println("-------");
				System.out.println("Warrior");
				System.out.println("Follower of Dharma");
				System.out.println("Respects elders");
				System.out.println("Respects woman");

				System.out.println("Cons:");
				System.out.println("------");
				System.out.println("None");

			}
				break;

			case "Karna": {
				System.out.println("Pros:");
				System.out.println("-------");
				System.out.println("Good at donations");

				System.out.println("Cons:");
				System.out.println("------");
				System.out.println("Follower of Adharma");
				System.out.println("Disrespects elders");
				System.out.println("Disrespects woman");

			}
				break;
		}

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
}
