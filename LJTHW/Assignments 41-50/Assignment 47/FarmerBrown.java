/**
* “Farmer Brown wants to spend exactly $100.00 and wants to purchase exactly 100 animals.
* If sheep cost $10 each, goats cost $3.50 each and chickens are $0.50 apiece, then how many of each animal should he buy?”
*/

public class FarmerBrown {
	public static void main(String[] args) {
		for (int s = 1; s <= 10; s++) {
			for (int g = 1; g <= 29; g++ ) {
				for (int c = 1; c <= 100; c++ ) {
					if (s + c + g == 100 && 10.00 * s + 3.50 * g + 0.50 * c == 100.00 ) {
						System.out.print(s + " sheep, ");
						System.out.print(g + " goats, and ");
						System.out.println(c + " chickens.");
					}
				}
			}
		}
	}
}