import java.util.*;;

public class MultiplicationTable_ext {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		int numberToPrintTheTableFor;
		int printUntilNum = 10;
		int counter = 0;
		char userChoice = 'y';

		System.out.println("Enter a number for which you want to print the table for:");
		numberToPrintTheTableFor = sc.nextInt();

		while (userChoice == 'y') {
			/*
			 * 
			 * Enter your logic to repeat
			 * 
			 */
			System.out.println("Do you want to continue (y/n)");
			userChoice = sc.next().charAt(0);
		}
		// Reset user choice
		userChoice = 'y';
		// While user choid is y go into the loop
		while (userChoice == 'y') {
			// Print the multiplication table until the counter value != printuntilnum.
			while (counter != printUntilNum) {
				System.out.println(numberToPrintTheTableFor + " x " + (counter + 1) + " = "
						+ (numberToPrintTheTableFor * (counter + 1)));
				counter++;
			}
			// Once the table is printed, ask the user if he/she would like to continue
			System.out.println("Do you want to continue (y/n)");
			userChoice = sc.next().charAt(0);
			// IF user selects y then ask the user a new number for which the table has to
			// be printed.
			if (userChoice == 'y') {
				System.out.println("Enter a number for which you want to print the table for:");
				numberToPrintTheTableFor = sc.nextInt();
				counter = 0;
			}

		}

	}
}
