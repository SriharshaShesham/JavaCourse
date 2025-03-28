import java.util.Scanner;

public class Moksham {
	static Scanner sc;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		LifeCycle();
	}

	public static void LifeCycle() {
		int punyam = 10;
		int papam = 100;
		int lifeCount = 0;
		int bal = -1;
		int karma = 0;
		while (bal != 0) // Condition decides when to continue in the loop // bal=60
		{
			lifeCount++; // lifecount=4
			System.out.println("New Life (Karma): " + lifeCount);
			System.out.println("Enter the Punyam percentage: ");
			punyam = sc.nextInt(); // punyam=0
			System.out.println("Enter the Papam percentage: ");
			papam = sc.nextInt(); // papam=0

			karma = punyam - papam; // 100-0 = 100

			if (bal == -1) // Bal =-1 -> it is the first life
			{
				bal = karma; // bal=60
			} else {
				bal = karma + bal; // 0+0 = 0
			}
			// bal =0
		}
		System.out.println("Congratulations! you are out of the life cycle.");
	}
}
