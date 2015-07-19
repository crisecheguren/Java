import java.util.Scanner;

public class CountingFor {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		int i;
		String message;

		System.out.println("Type in a message, and I'll display it five times.");
		System.out.print("Message:  ");
		message = keyboard.nextLine();

		for ( i = 1; i <= 5; i++ ) {
			System.out.println( i + ". " + message );
		}

		System.out.println("\nNow I'll display it ten times and count by 5s.");

		for ( i = 5; i <= 50; i += 5) {
			System.out.println( i + ". " + message );
		}

		System.out.println("\nFinally, three times counting backward." );
		for ( i = 3; i > 0; i -= 1 ) {
			System.out.println( i + ". " + message );
		}
	}
}