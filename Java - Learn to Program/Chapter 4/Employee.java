/*
4.20 (Salary Calculator) Develop a Java application that determines the gross pay for each of three employees.
The company pays straight time for the first 40 hours worked by each employee and time and a half for all hours worked
in excess of 40. You’re given a list of the employees, their number of hours worked last week and their hourly rates.
Your program should input this information for each employee, then determine and display the employee’s gross pay.

Use class Scanner to input the data.
*/


public class Employee
{
	private String fullName;
	private int hoursWorked;
	private int overtime;
	private double payPerHour;

	public Employee (String fullName, int hoursWorked, double payPerHour)
	{

		this.fullName = fullName;
		this.payPerHour = payPerHour;
		if (hoursWorked <= 40)
		{
			this.hoursWorked = hoursWorked;
		} // end if
		else
		{
			this.hoursWorked = hoursWorked;
			overtime = hoursWorked - 40;
		} // end else

	} // end constructor

	public void setFullName(String fullName)
	{
		this.fullName = fullName;
	}

	public String getFullName()
	{
		return fullName;
	}

	public void setHoursWorked(int hoursWorked)
	{
		this.hoursWorked = hoursWorked;
	}

	public int getHoursWorked()
	{
		return hoursWorked;
	}

	public int getOvertime()
	{
		return overtime;
	}

	public void setPayPerHour(double payPerHour)
	{
		this.payPerHour = payPerHour;
	}

	public double getPayPerHour()
	{
		return payPerHour;
	}

	public double calculatePay()
	{
		if (hoursWorked > 40)
			return (double) hoursWorked * payPerHour + (payPerHour * .5) * overtime;
		else
			return hoursWorked * payPerHour;
	}

	public static void displayGrossPay(Employee emp)
	{
		System.out.printf("Employee Name:  %s%nGross Pay:  $%.2f%n", emp.getFullName(), emp.calculatePay());
	}


}