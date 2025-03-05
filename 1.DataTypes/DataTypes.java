public class DataTypes {
	// 1234 -> sankyalu
	// a b c -> aksharalu
	// rama sitha -> padalu
	public static void main(String[] args) {
		// Primitive

		// Numeric
		// -----------

		// Below accepts 1,2,3......
		// ----------------------
		// byte -> accepts only one number -128 to 127
		// short ->
		// int ->
		// long ->

		// Below accepts 1.2,2.3,3.1,......
		// float
		// double

		// Non-Numeric
		// ---------------
		// Boolean -> true or false
		// char -> a, b, c

		// This is the first number we initialize to add
		byte firstNumber = 5;

		// This is the second number we initialize to add
		byte secondNumber = 22;

		// below variable used to store the summation of first and second numbers.
		float result;

		result = firstNumber + secondNumber;

		// System.out.print("This is the first number: ");
		// System.out.println(firstNumber);
		// System.out.print("This is the second number: ");
		// System.out.println(secondNumber);
		// System.out.print("This is the result: ");
		// System.out.println(result);

		// Improvise the print
		System.out.println("This is the first number: " + firstNumber);
		System.out.println("This is the second number: " + secondNumber);
		System.out.println("This is the result: " + result);

		System.out.println();

		// Improvise the print
		System.out.println("This is the first number: " + firstNumber + ". The second number is: " + secondNumber);
		System.out.println("This is the result: " + result);

		System.out.println();

		result = (float) secondNumber / firstNumber; // 22.0/5

		System.out.println("This is the first number: " + firstNumber);
		System.out.println("This is the second number: " + secondNumber);
		System.out.println("This is the result: " + result);

	}
}
