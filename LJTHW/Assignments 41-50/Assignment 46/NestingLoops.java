public class NestingLoops {
	public static void main(String[] args) {
		// this is #1 - I'll call it "CI"
		for (char c = 'A'; c <= 'E'; c++) {
			for (int i = 1; i <= 3; i++) {
				System.out.println( c + " " + i );
			}
		}

		System.out.println("\n");

		// this is #2 - I'll call it "AB"
		for (int a = 1; a <= 3; a++) {
			for (int b = 1; b <= 3; b++) {
				System.out.print( "(" + a + "," + b + ")" );
			}

			System.out.println(" After loop.");
		}

		System.out.println("\n");
	}
}