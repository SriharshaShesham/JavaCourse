
public class ScopeApartments {
	// Global variable
	static String CommonItem = "WaterSupply"; // Memory is allocated and also "WaterSupply" value is saved to the
										// "CommonItem" memory.

	public static void main(String[] args) {
		String CommonItem;// Variable Declaration -> Allocates memory with name "CommonItem"

		CommonItem = "Nothing"; // Variable Initialization -> "Nothing" is saved to the allocated memory of
							// "CommonItem"
		System.out.println("Common Item Status: " + CommonItem);

		Portions1();
		System.out.println("Common Item Status: " + CommonItem);

		Portions2();
		System.out.println("Common Item Status: " + CommonItem);

		Portions3();
		System.out.println("Common Item Status: " + CommonItem);
	}

	public static void Portions1() {
		// Local variables
		String familyName = "Shesham";
		String Utilty = "Electricity";
		CommonItem = "On";
	}

	public static void Portions2() {
		String familyName = "Nerella";
		String Utilty = "Electricity";
		CommonItem = "Off";
	}

	public static void Portions3() {
		String familyName = "Kota";
		String Utilty = "Electricity";
		CommonItem = "On";
	}
}
