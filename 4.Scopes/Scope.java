// Global
// Local Variables

public class Scope {
	static String Avatar = "Vishnu";

	public static void main(String[] args) // Bhagavatam
	{
		Ramayanm();
		System.out.println("Avatar: " + Avatar);
		Mahabharatam();
		System.out.println("Avatar: " + Avatar);
	}

	public static void Ramayanm() {
		Avatar = "Rama";
		String MainCharacter = "Rama";
	}

	public static void Mahabharatam() {
		Avatar = "Krsihna";
		String MainCharacterInMB = "Krishna";
	}
}
