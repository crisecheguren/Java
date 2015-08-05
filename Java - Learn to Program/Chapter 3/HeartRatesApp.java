import java.util.Scanner;

public class HeartRatesApp
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in); // scanner for input

		System.out.println("Welcome to the Heart Rates App!");

		System.out.print("Please enter your first name:  "); // prompt
		String firstName = keyboard.nextLine();
		System.out.print("\nPlease enter your last name:  ");
		String lastName = keyboard.nextLine();
		System.out.print("\nPlease enter your birth year:  ");
		int year = keyboard.nextInt();
		System.out.print("\nPlease enter your birth month (1-12):  ");
		int month = keyboard.nextInt();
		System.out.print("\nPlease enter the day of your birth month (1-31):  ");
		int day = keyboard.nextInt();

		HeartRates user = new HeartRates(firstName, lastName, year, month, day);

		int age = user.calculateAge();
		int maxHeartRate = user.calculateMaxHeartRate(age);

		System.out.println("Name:  " + firstName + " " + lastName + "\nDOB:  " );
		System.out.println("Age:  " + age + "\nMax Heart Rate:  " + maxHeartRate);
		System.out.println("Target Heart Rate is: " + user.calculateTargetHeartRate(maxHeartRate));


	} // end main
} // end class HeartRatesApp