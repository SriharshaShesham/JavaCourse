import java.util.Scanner;

public class SwitchChar {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		char userChoice;
		String tempString;
		System.out.println("Are you a follower of Sanathana Dharma? (y/n)");
		// y n. yes
		// string -> collection of chars
		/*
		 * "Arjuna"
		 * A r j u n a
		 * 0 1 2 3 4 5
		 * 
		 * "yes"
		 * y e s
		 * 0 1 2
		 */
		tempString = sc.next();
		userChoice = tempString.charAt(0);

		/*
		 * if
		 * {
		 * }
		 * else if()
		 * {
		 * }
		 * else
		 * {
		 * 
		 * }
		 */
		switch (userChoice) {
			case 'y': {
				System.out.println("Follower of Sanathana Dharma");
			}
				break;

			case 'n': {
				System.out.println("Not a follower of Sanathana Dharma");
			}
				break;

			default: {
				System.out.println("Invalid selection");
			}
		}

	}
}
