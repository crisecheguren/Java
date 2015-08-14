/*
(Sales Commission Calculator) A large company pays its salespeople on a commission basis.
The salespeople receive $200 per week plus 9% of their gross sales for that week.
For example, a salesperson who sells $5,000 worth of merchandise in a week receives $200 plus 9% of $5000, or a total of $650.
You’ve been supplied with a list of the items sold by each salesperson.

The values of these items are as follows:
Item 	Value
1 		239.99
2 		129.75
3 		99.95
4 		350.89

Develop a Java application that inputs one salesperson’s items sold for last week and calculates and displays
that salesperson’s earnings. There’s no limit to the number of items that can be sold.


*/
import java.util.Scanner;

public class ComissionCalculator
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		// initialize instance variables
		double totalSales = 0;
		int itemsSold = 1;
		double value = 0;

		// prompt for first item (could be -1)
		System.out.printf("Enter value of item %d or enter -1 to exit:  ", itemsSold);
		value = keyboard.nextDouble();
		// while input does not equal -1
		while (value != -1)
		// add value to totalSales
		{
			++itemsSold;
			totalSales += value;
			System.out.printf("%nEnter value of item %d or enter -1 to exit:  ", itemsSold);
			value = keyboard.nextDouble();
		} // end while

		// if totalSales != 0 then
		if (totalSales != 0)
		{
			double comission = totalSales * .09;
			System.out.printf("You sold $%.2f this week", totalSales);
			System.out.printf("%nYou've earned $%.2f in comission.", comission);
			double totalEarned = comission + 200.00;
			System.out.printf("%nThat means you made $%.2f this week.", totalEarned);
		}// end if
		else
		{
			System.out.println("You gotta ABC, dude.  ALWAYS BE CLOSING.");
		} // end else

	// else print "you made no sales, dude."
	} // end main
} // end class