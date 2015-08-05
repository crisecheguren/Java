public class Student
{
	// instance variables
	private String name;
	private double average;

	// constructor
	public Student(String name, double average)
	{
		this.name = name;

		//validate average is above 0.0 and equal to or less than 100.00
		if (average > 0.0)
			if (average <= 100.0)
				this.average = average; // assign to instance variable
	} // end constructor

	public void setName(String name)
	{
		this.name = name;
	} // end method setName

	public String getName()
	{
		return name;
	} // end method getName

	public void setAverage(double studentAverage)
	{
		if (average > 0.0)
			if (average <= 100.0)
				this.average = average;
	} // end method setAverage

	public double getAverage()
	{
		return average;
	} // end method getAverage

	public String getLetterGrade()
	{
		String letterGrade = ""; // initialized to empty String

		if (average >= 90.0)
			letterGrade = "A";
		else if (average >= 80.0)
			letterGrade = "B";
		else if (average >= 70.0)
			letterGrade = "C";
		else if (average >= 60.0)
			letterGrade = "D";
		else
			letterGrade = "F";

		return letterGrade;
	} // end method getLetterGrade
} // end class student