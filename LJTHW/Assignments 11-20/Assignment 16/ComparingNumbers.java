import java.util.Scanner;

public class ComparingNumbers {
	public static void main ( String[] args ) {
		Scanner keyboard = new Scanner(System.in);
		double first, second;

		System.out.println( "Give me two numbers.\nFirst:  " );
		first = keyboard.nextDouble();
		System.out.print( "Second:  " );
		second = keyboard.nextDouble();

		if ( first < second )
			System.out.println( first + " is LESS THAN " + second );

		if ( first <= second )
			System.out.println( first + " is LESS THAN or EQUAL TO " + second );

		if ( first == second )
			System.out.println( first + " is EQUAL TO " + second );

		if ( first >= second )
			System.out.println( first + " is GREATER THAN or EQUAL TO " + second );

		if ( first > second )
			System.out.println( first + " is GREATER THAN " + second );

		if ( first != second ) {
			System.out.println( first + " is NOT EQUAL TO " + second );
			System.out.println( "Hey!" );
		}
	}
}

/*
1. Add another line of code after line 37 that says "Hey!" . Indent it so that it lines up with the statement above it.
Run the program, and see what happens. Is the “Hey” part of the if statement body? That is, when the if statement is skipped, is the “Hey” skipped, too, or does it run no matter what? What do you think?

1a. Hey is not part of the if block because only the next statement after "if" is part of the block when not using brackets.

1. Add curly braces around the body of the final if statement so that the “Hey” line is part of the body. Then remove all the other if statement body curly braces so that only the last if statement in the program has them. Confirm that everything works as expected.

*/