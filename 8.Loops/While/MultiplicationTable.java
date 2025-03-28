import java.util.*;;

public class MultiplicationTable {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		int printUntilNum = 10;
		int counter = 1;
		while (counter != printUntilNum) {
			System.out.println("10 x " + counter + " = " + (10 * counter));
			counter++;
		}

	}
}
