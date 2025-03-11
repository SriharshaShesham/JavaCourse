public class Operators {
	public static void main(String[] args) {
		/*
		 * Different Types of operators
		 * 
		 * +
		 * -
		 * *
		 * /
		 * %
		 * ++
		 * --
		 * 
		 */

		int firstNumber = 20;
		int secondNumber = 3;

		// Addition (20+5) = 25
		System.out.println("Addition (" + firstNumber + " + " + secondNumber + "=): " + (firstNumber + secondNumber));
		System.out.println(
				"Substraction (" + firstNumber + " - " + secondNumber + "=): " + (firstNumber - secondNumber));
		System.out.println(
				"Multiplication (" + firstNumber + " x " + secondNumber + "=): " + (firstNumber * secondNumber));
		System.out.println("Division (" + firstNumber + " / " + secondNumber + "=): " + (firstNumber / secondNumber));
		System.out.println("Modulus (" + firstNumber + " % " + secondNumber + "=): " + (firstNumber % secondNumber));
		// Post increment -> Print first and for the next step increase.
		System.out.println("Post-Increment (" + firstNumber + "++ =): " + (firstNumber++));
		// Pre increment -> Increment first and print it.
		System.out.println("Pre-Increment (" + firstNumber + "++ =): " + (++firstNumber));

		System.out.println("Post-Decrement (" + firstNumber + "-- =): " + (firstNumber--));

		System.out.println("Pre-Decrement (" + firstNumber + "-- =): " + (--firstNumber));

	}
}
