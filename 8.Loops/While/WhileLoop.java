
//While
//Do-While
//For
public class WhileLoop {
	// To run a statement/function/logic multiple times

	public static void main(String[] args) {
		int endPoint = 10;
		int startPoint = 0;
		System.out.println("Starting loop with StartPoint:" + startPoint + "; Endpoint: " + endPoint);
		while (startPoint != endPoint) // startPoint=10 and endPoint =10
		{
			System.out.println(startPoint); // 9
			startPoint++; // startPoint=10;
		}
		System.out.println("Ended loop at StartPoint:" + startPoint + "; Endpoint: " + endPoint);
	}
}
