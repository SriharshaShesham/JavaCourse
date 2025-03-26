import java.util.Scanner;

public class SwitchIntro {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Program();
	}

	public static void Program() {
		/*
		 * Ramayanam
		 * ----------
		 * 1. Balakanda
		 * 2. Ayodyakanda
		 * 3. Aranyakanda
		 * 4. Kishkindakanda
		 * 5. Sundarakanda
		 * 6. Yudhakanda
		 * 7. Uttarakanda
		 */
		int userSelection;
		UserScreen("Welcome to Ramayanam explorer");
		System.out.println("Please enter a number to display the corresponding kandam");
		userSelection = GetNumberFromUser();
		UsingIf(userSelection);
		UsingSwitch(userSelection);

	}

	public static void UsingSwitch(int userInput) {
		UserScreen("Using Switch Case");
		/*
		 * Syntax
		 * Switch(value)
		 * {
		 * case value?:
		 * {
		 * 
		 * }break;
		 * }
		 */

		switch (userInput) {
			case 1: {
				System.out.println("Balakanda");
			}
				break;

			case 2: {
				System.out.println("Ayodyakanda");
			}
				break;

			case 3: {
				System.out.println("Aranyakanda");
			}
				break;

			case 4: {
				System.out.println("Kishkindakanda");
			}
				break;

			case 5: {
				System.out.println("Sundarakanda");
			}
				break;

			case 6: {
				System.out.println("Yudhakanda");
			}
				break;

			case 7: {
				System.out.println("Uttarakanda");
			}
				break;
		}

	}

	public static void UsingIf(int userInput) {
		UserScreen("Using IF");
		if (userInput == 1) {
			System.out.println("Balakanda");
		} else if (userInput == 2) {
			System.out.println("Ayodyakanda");
		} else if (userInput == 3) {
			System.out.println("Aranyakanda");
		} else if (userInput == 4) {
			System.out.println("Kishkindakanda");
		} else if (userInput == 5) {
			System.out.println("Sunderakanda");
		} else if (userInput == 6) {
			System.out.println("Yudhakanda");
		} else if (userInput == 7) {
			System.out.println("Uttarakanda");
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
