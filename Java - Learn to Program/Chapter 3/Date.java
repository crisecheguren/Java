/*
(Date Class) Create a class called Date that includes three instance variables —

a month (type int), a day (type int) and a year (type int).

Provide a constructor that initializes the three instance variables and assumes that the values provided are correct.

Provide a set and a get method for each instance variable.

Provide a method displayDate that displays the month, day and year separated by forward slashes (/).

Write a test app named DateTest that demonstrates class Date’s capabilities.
*/
public class Date
{
	//instance variables
	int month;
	int day;
	int year;

	// constructor assumes provided values are OK
	public Date(int month, int day, int year)
	{
		this.month = month;
		this.day = day;
		this.year = year;
	}

	// method to set the month
	public void setMonth(int month)
	{
		this.month = month;
	} // end method setMonth

	// method to get month
	public int getMonth()
	{
		return month;
	} // end method getMonth

	// method to set the day
	public void setDay(int day)
	{
		this.day = day;
	} // end method setDay

	// method to get the day
	public int getDay()
	{
		return day;
	} // end method getDay

	// method to set year
	public void setYear(int year)
	{
		this.year = year;
	} // end method setYear

	public int getYear()
	{
		return year;
	} // end method getYear

	public static void displayDate(Date date)
	{
		System.out.printf("%n%n%d/%d/%d%n%n", date.month, date.day, date.year);
	}
} // end class Date