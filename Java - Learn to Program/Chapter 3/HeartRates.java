/*
(Target-Heart-Rate Calculator)
While exercising, you can use a heart-rate monitor to see that your heart rate stays within a safe range suggested
by your trainers and doctors. According to the American Heart Association (AHA), the formula for calculating your
maximum heart rate in beats per minute is 220 minus your age in years. Your target heart rate is a range that’s
50–85% of your maximum heart rate.

[Note: These formulas are estimates provided by the AHA. Maximum and target heart rates may vary based on the health,
fitness and gender of the individual. Always consult a physician or qualified health-care professional before beginning
or modifying an exercise program.]

Create a class called HeartRates.

The class attributes should include the person’s first name, last name and date of birth (consisting of separate
attributes for the month, day and year of birth).

Your class should have a constructor that receives this data as parameters. For each attribute provide set and get methods.

The class also should include a method that calculates and returns the person’s age (in years), a method that calculates
and returns the person’s maximum heart rate and a method that calculates and returns the person’s target heart rate.

Write a Java app that prompts for the person’s information, instantiates an object of class HeartRates and prints
the information from that object—including the person’s first name, last name and date of birth—then calculates and
prints the person’s age in (years), maximum heart rate and target-heart-rate range.
*/


public class HeartRates
{
	// instance variables
	private String firstName;
	private String lastName;
	private int month;
	private int day;
	private int year;


	// constructor
	public HeartRates(String firstName, String lastName, int year, int month, int day)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.month = month;
		this.day = day;
		this.year = year;
	} // end constructor HeartRates

	// method to set first name
	public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	} // end method setFirstName

	// method to get first name
	public String getFirstName()
	{
		return firstName;
	} // end method getFirstName

	// method to set last name
	public void setLastName(String lastName)
	{
		this.lastName = lastName;
	} // end method setLastName

	// method to get last name
	public String getLastName()
	{
		return lastName;
	} // end method getLastName

	// method to set month
	public void setMonth(int month)
	{
		this.month = month;
	} // end method setMonth

	// method to get month
	public int getMonth()
	{
		return month;
	} // end method getMonth

	// method to set day
	public void setDay(int day)
	{
		this.day = day;
	} // end method setDay

	// method to get day
	public int getDay()
	{
		return day;
	} // end method getDay;

	// method to set year
	public void setYear(int year)
	{
		while (year < 1000)
		{
			System.out.println("Please enter a four digit year.");
			System.out.println();
		} // end while
		this.year = year;
	} // end method setYear

	// method to get year
	public int getYear()
	{
		return year;
	} // end method getYear

	// method to calculate ~age
	public int calculateAge()
	{
		return 2015 - year;
	} // end method calculateAge

	// method to calculate max heart rate
	public int calculateMaxHeartRate(int age)
	{
		return 220 - age;
	} // end method calculateMaxHeartRate

	// method to calculate target heart rate
	public String calculateTargetHeartRate(int maxHeartRate)
	{
		double targetLow = maxHeartRate * .50;
		double targetHigh = maxHeartRate * .85;
		return String.format(" %.2f - %.2f", targetLow, targetHigh);

	}


} // end class HeartRates