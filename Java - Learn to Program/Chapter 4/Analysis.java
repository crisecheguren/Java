import java.util.Scanner;

public class Analysis
{
	public static void main(String[] args)
	{
		// create a scanner object to obtain input from the keyboard
		Scanner keyboard = new Scanner(System.in);

		// initializing variables in declarations
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;

		// process 10 students using counter-controlled loop
		while (studentCounter <= 10)
		{
			// prompt user for input and obtain value
			System.out.print("Enter result (1 = pass, 2 = fail):  ");
			int result = keyboard.nextInt();

			// if ... else is nested in the while statement
			if (result == 1)
				passes++;
			else
				failures++;

			// increment studentCounter so loop eventually terminates
			studentCounter++;
		} // end while

		// termination phase; prepare and display the results
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);

		// determine wheter more than 8 students passed
		if (passes > 8)
			System.out.println("Bonus to the instructor!");
	} // end main
} // end Class