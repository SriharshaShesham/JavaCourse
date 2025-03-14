import java.util.Scanner;

public class ParameterizedFunctions {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		Program();
	}

	public static void Program() {
		// Take six subject marks. For every entry calculate total and also /100

		// declare six subjects
		int teluguMarks, hindiMarks, engMarks, mathMarks, sciMarks, socMarks, totalMarks;
		float totalGPA;
		totalMarks = 0;

		System.out.println("Enter the marks for the subjects:");
		PrintUnderline();

		// Get the marks for telugu
		System.out.println("Telugu: ");
		teluguMarks = GetMarks();
		totalGPA = PrintTotalAndGetGPA(totalMarks, teluguMarks);

		System.out.println("Hindi: ");
		hindiMarks = GetMarks();
		totalGPA = PrintTotalAndGetGPA(totalMarks, hindiMarks);

		System.out.println("English: ");
		engMarks = GetMarks();
		totalGPA = PrintTotalAndGetGPA(totalMarks, engMarks);

		System.out.println("Maths: ");
		mathMarks = GetMarks();
		totalGPA = PrintTotalAndGetGPA(totalMarks, teluguMarks);

		System.out.println("Science: ");
		sciMarks = GetMarks();
		totalMarks = totalMarks + sciMarks;
		totalGPA = totalMarks / 100;
		System.out.println(totalGPA);

		System.out.println("Social: ");
		socMarks = GetMarks();
		totalGPA = PrintTotalAndGetGPA(totalMarks, socMarks);

	}

	public static int GetMarks() {
		// declaration and initialization same line
		int marks = sc.nextInt();
		return marks;
	}

	public static float PrintTotalAndGetGPA(int totalMarks, int subjMarks) {
		float totalGPA;
		totalMarks = totalMarks + subjMarks;
		totalGPA = totalMarks / 100;
		System.out.println(totalGPA);
		return totalGPA;
	}

	public static void PrintUnderline() {
		System.out.println("--------------------------------------------------------------");
		System.out.println();
	}
}
