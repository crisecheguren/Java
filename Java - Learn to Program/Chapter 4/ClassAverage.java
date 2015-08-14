import java.util.Scanner;

public class ClassAverage
{
	public static void main(String[] args)
	{
		// Create a Scanner to obtain input from the command window
		Scanner keyboard = new Scanner(System.in);

		// initialization phase
		int total = 0; // initialize the sum of the grades entered by the user
		int gradeCounter = 0; // initialize # of grades entered so far

		// processing phase
		// prompt for input and read grade from the user
		System.out.print("Enter grade or -1 to quit:  ");
		int grade = keyboard.nextInt();

		// loop until sentinel value from user
		while ( grade != -1 )
		{
			total += grade; // add grade to total
			gradeCounter++;

			//prompt user for input and read next grade from user
			System.out.print("Enter grade or -1 to quit:  ");
			grade = keyboard.nextInt();
		} // end while

		// termination phase
		// if user entered at least one grade...
		if ( gradeCounter != 0 )
		{
			// user number with decimal point to calculate average of grades
			double average = (double) total / gradeCounter;

			// display total and average (with two digits precision)
			System.out.printf("%nTotal of the %d grades entered is %d%n",
				gradeCounter, total);
			System.out.printf("Class average is %.2f%n", average);
		} // end if
		else
		{
			System.out.println("No grades were entered.");
		} // end else
	} // end main
} // end ClassAverage