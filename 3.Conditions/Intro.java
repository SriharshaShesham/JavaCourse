import java.util.Scanner;

public class Intro {
	public static void main(String[] args) {

		String programName = "Check if user is going in the path of Rama/Ravana";
		System.out.println("-----------------------------------------------------------");
		System.out.println(programName);
		System.out.println("-----------------------------------------------------------");

	}

	public static void IfCondition() {
		Scanner sc = new Scanner(System.in);
		boolean firstQuestionAnswer;
		boolean secondQuestionAnswer;
		System.out.println("Are you interested in listening to others mistakes");
		firstQuestionAnswer = sc.nextBoolean();
		System.out.println("Are you interested in following dharma");
		secondQuestionAnswer = sc.nextBoolean();

		if (firstQuestionAnswer == false) {
			// If above condition is satisfied
			if (secondQuestionAnswer == true) {
				System.out.println("You are following in the path of Rama");
			}
		}
		if (firstQuestionAnswer == true) {
			if (secondQuestionAnswer == true) {
				System.out.println("You are following in the path of Ravana");
			}
		}
	}

	public static void IfConditionSingle() {
		Scanner sc = new Scanner(System.in);
		boolean firstQuestionAnswer;
		boolean secondQuestionAnswer;
		System.out.println("1. Are you interested in listening to others mistakes");
		firstQuestionAnswer = sc.nextBoolean();
		System.out.println("2. Are you interested in following dharma");
		secondQuestionAnswer = sc.nextBoolean();

		// and &&
		// or ||
		if ((firstQuestionAnswer == false) && ((secondQuestionAnswer == true))) {
			System.out.println("You are following in the path of Rama");
		}
		if ((firstQuestionAnswer == true) && (secondQuestionAnswer == true)) {
			System.out.println("You are following in the path of Ravana");
		}
	}

	public static void IfElseCondition() {
		Scanner sc = new Scanner(System.in);
		boolean firstQuestionAnswer;
		boolean secondQuestionAnswer;
		System.out.println("Are you interested in listening to others mistakes");
		firstQuestionAnswer = sc.nextBoolean();
		System.out.println("Are you interested in following dharma");
		secondQuestionAnswer = sc.nextBoolean();

		if (firstQuestionAnswer == false) {
			if (secondQuestionAnswer == true) {
				System.out.println("You are following in the path of Rama");
			}
		} else {
			System.out.println("You are following in the path of Ravana");
		}

	}
}
