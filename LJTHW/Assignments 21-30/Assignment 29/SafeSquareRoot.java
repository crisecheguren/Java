import java.util.Scanner;

public class SafeSquareRoot {
	public static void main ( String[] args ){
		Scanner keyboard = new Scanner(System.in);
		double x, y, z;

		System.out.println( "Give me a number and I'll find the square root for you." );
		System.out.println( "(No negatives, please.)" );
		x = keyboard.nextDouble();

		if ( x < 0 ) {
			System.out.println( "Alright, let's try it." );
			z = Math.abs(x);
			x = z;
			y = Math.sqrt(x);

			System.out.println("The square root of -" + x + " is (i)" + y);
		}
		else {

		y = Math.sqrt(x);

		System.out.println("The square root of " + x + " is " + y);

		}
	}
}