/*
(Employee Class)

Create a class called Employee that includes three instance variables —
a first name (type String), a last name (type String) and a monthly salary (double).

Provide a constructor that initializes the three instance variables.

Provide a set and a get method for each instance variable.

If the monthly salary is not positive, do not set its value.

Write a test app named EmployeeTest that demonstrates class Employee’s capabilities.

Create two Employee objects and display each object’s yearly salary.

Then give each Employee a 10% raise and display each Employee’s yearly salary again.
*/
public class Employee
{
	// instance variables
	String firstName;
	String lastName;
	double monthlySalary;

	// constructor
	public Employee(String firstName, String lastName, double monthlySalary)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		if (monthlySalary > 0.0) // if monthly salary is greater than 0 set it to monthlySalary
			this.monthlySalary = monthlySalary;
	} // end constructor Employee

	// method to set firstName
	public void setFirstName(String firstName)
	{
		this.firstName = firstName; // store the first name
	} // end method setFirstName

	// method to get firstName
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

	// method to set monthly salary
	public void setMonthlySalary(double monthlySalary)
	{
		if (monthlySalary > 0.0)
			this.monthlySalary = monthlySalary;
	} // end method setMonthlySalary

	// method to get monthly salary
	public double getMonthlySalary()
	{
		return monthlySalary;
	} // end method getMonthlySalary

	// method to display monthly salary
	public void displayYearlySalary()
	{
		System.out.printf("%s's yearly salary is $%.2f%n%n", firstName, monthlySalary * 12);
	} // end method displayMonthlySalary





} // end class Employee