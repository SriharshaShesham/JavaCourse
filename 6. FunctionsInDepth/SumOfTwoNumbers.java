
public class SumOfTwoNumbers {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int total;

		String programName = "Sum of two numbers";
		PrintTitle(programName);

		PrintTitle("Welcome to SBI ATM");
		PrintTitle("Screen 2");

		total = SumOf2Nums(num1, num2); // 20+30 =50
		System.out.println(total);

		System.out.println(SumOf2Nums(25, 26));

	}

	public static int SumOf2Nums(int number1, int number2) {
		int returnVal;
		returnVal = number1 + number2;
		return returnVal;
	}

	public static void PrintTitle(String title) {
		System.out.println("-----------------------------------------------------------------");
		System.out.println(title);
		System.out.println("-----------------------------------------------------------------");
	}
}
