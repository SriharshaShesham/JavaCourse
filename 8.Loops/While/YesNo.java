import java.util.*;;

public class YesNo {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);

		System.out.println(
				"You decide when you wan to get moksham using (y/n). Type 'y' if you want to exit life cycle and get moksham. else type any");
		char choice = 'n';

		while (choice != 'y') 
		{
			System.out.println("What are your plans? Moksham? (y/n)");
			choice = sc.next().charAt(0);
		}

		System.out.println("You made a wise decision by choosing Moksham");

	}
}
