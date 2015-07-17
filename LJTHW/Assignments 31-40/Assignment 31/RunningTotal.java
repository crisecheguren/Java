import java.util.Scanner;

public class RunningTotal {
	public static void main (String[] args){
		Scanner keyboard = new Scanner(System.in);

		int newTotal, current, total = 0;

		System.out.print("Type in a bunch of values and I'll add them up.  ");
		System.out.println("I'll stop when you type a zero.");

		do {
			System.out.print("Value:  ");
			current = keyboard.nextInt();
			newTotal = current + total;
			total = newTotal;
			System.out.println("The total so far is:  " + total);
		} while ( newTotal < 21 );
		System.out.println("You got to 21.");
	}
}