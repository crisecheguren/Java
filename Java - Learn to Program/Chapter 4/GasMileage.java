/*
(Gas Mileage) Drivers are concerned with the mileage their automobiles get.
One driver has kept track of several trips by recording the miles driven and gallons used for each tankful.

Develop a Java application that will input the miles driven and gallons used (both as integers) for each trip.

The program should calculate and display the miles per gallon obtained for each trip and print the combined
miles per gallon obtained for all trips up to this point.

All averaging calculations should produce floating-point results. Use class Scanner and sentinel-controlled
repetition to obtain the data from the user.
*/

// TOP LEVEL PSEUDOCODE
// create a program that takes input from the user, displays the mpg for each trip, and an average for every trip.

// SECOND LEVEL PSEUDOCODE
// declare instance variables

// create a way for user to input data

// prompt the user for the miles per gallon
// input
// prompt the user for the gallons used
// input

// add every trip to a seperate variable that keeps track of both totals

// use sentinal variable to stop taking input and calculate results

// print the gas mileage of each trip as a double
// print the gas mileage of all trips as a double

// THIRD LEVEL PSEUDOCODE

// int milesDriven
// int gallonsUsed
// int milesTotal
// int gallonsTotal
// arraylist obj

// Scanner object

// until the user has entered no keep asking for milesDriven and gallonsUsed
// add the average for every trip to a list array and add the totals up for an average calculation

// print when no is entered
import java.util.*;

public class GasMileage
{

	public static void main(String[] args)
	{

		// declare instance variables
		int milesDriven = 0;
		int gallonsUsed = 0;
		double currentTripAvg = 0.0;
		String addTrip = "yes";
		double milesTotal = 0.0;
		double gallonsTotal = 0.0;
		double totalMPG = 0.0;
		int trips = 1;
		List<Double> tripAverages = new ArrayList<Double>();

		Scanner keyboard = new Scanner(System.in);

		while (! addTrip.equals("no"))
		{
			System.out.print("\nPlease enter miles driven:  ");
			milesDriven = keyboard.nextInt();
			milesTotal += milesDriven;
			System.out.print("\nPlease enter gallons used:  ");
			gallonsUsed = keyboard.nextInt();
			gallonsTotal += gallonsUsed;
			currentTripAvg = milesDriven / gallonsUsed;
			tripAverages.add(currentTripAvg);
			System.out.print("\nWould you like to add another trip?  ");
			addTrip = keyboard.next();
				while ( ! addTrip.equals("yes") && ! addTrip.equals("no"))
					{
						System.out.print("\nPlease enter \"yes\" or \"no\":   ");
						addTrip = keyboard.next();
					}
		}

		for (int i = 0; i < tripAverages.size(); i++)
		{
			System.out.println("\nTrip " + trips + " MPG - " + tripAverages.get(i));
			trips++;
		}
		totalMPG = milesTotal / gallonsTotal;
		System.out.println();
		System.out.printf("\nMPG for all trips is - %.2f%n", totalMPG);

	} // end main

} // end class GasMileage
