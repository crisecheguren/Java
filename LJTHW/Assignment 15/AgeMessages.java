import java.util.Scanner;

public class AgeMessages {
	public static void main ( String[] args ) {
		Scanner keyboard = new Scanner(System.in);

		int age;

		System.out.print( "How old are you? " );
		age = keyboard.nextInt();

		if ( age < 13 ) {
			System.out.println( "You are too young to create a Facebook account." );
		} else {
			System.out.println( "You are old enough to create a Facebook account." );
		}
		if ( age < 16 ) {
			System.out.println( "You are too young to get a driver's license." );
		} else {
			System.out.println( "You are old enough to get a driver's license." );
		}
		if ( age < 18 ) {
			System.out.println( "You are too young to get a tattoo." );
		} else {
			System.out.println( "You are old enough to get a tattoo." );
		}
		if ( age < 21 ) {
			System.out.println( "You are too young to drink alcohol." );
		} else {
			System.out.println( "You are old enough to drink alcohol." );
		}
		if ( age < 35 ) {
			System.out.println( "You are too young to run for president of the United States.\nHow sad!" );
		} else {
			System.out.println( "You are old enough to run for president of the United States.\nHow exciting!" );
		}

		if ( age >= 65 ) {
			System.out.println( "You're old enough to retire!" );
		}

	}
}

/*
Study Drills
1. If you type in an age greater than 35 what gets printed? Why?

1a. Nothing because none of the if conditions are true.

2. Add one more if statement comparing their age to 65. If their age is greater than or equal to 65,
say “You are old enough to retire!”.

For each if statement, add another if statement that says the opposite. For example, if their age is
greater than or equal to 13, say “You are old enough to create a Facebook account.” When you are done, your program should show six messages every time no matter what age you enter.

*/

