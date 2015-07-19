import java.util.Scanner;
/**
* Try to change the code so that if the order number is not found, it prints out a single message saying so.
* This is tricky. Even if you aren’t successful, give it a good effort before moving on to the next exercise.
*/


public class ArrayLinearSearch {
	public static void main(String[] args) {
		Scanner keyboard  = new Scanner(System.in);

		int[] orderNumbers = {
			12345,
			54321,
			78753,
			101010,
			8675309,
			31415,
			271828
		};

		int toFind,
			notFound = 0;

		System.out.println("There are " + orderNumbers.length + " orders in the database.");

		System.out.print("Orders:  ");
		for ( int num : orderNumbers ) {
			System.out.print( num + "  " );
		}
		System.out.println();

		System.out.print("Which order to find?  ");
		toFind = keyboard.nextInt();

		for ( int i : orderNumbers ) {
			if ( i == toFind ) {
				System.out.println( i + " found.");
			} else if ( i != toFind ) {
				notFound++;
			}
		}

		if ( notFound >= orderNumbers.length ) {
			System.out.println("Order " + toFind + " not found.");
		}
	}
}