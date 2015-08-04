import java.util.Scanner;

public class EmployeeTest
{
	public static void main(String[] args)
	{
		double raise;

		Employee employee1 = new Employee("John", "Brown", 5000.00);
		Employee employee2 = new Employee("Stacy", "Williams", 4000.00);

		employee1.displayYearlySalary();
		employee2.displayYearlySalary();

		raise = employee1.getMonthlySalary();
		raise = raise * .10 + employee1.getMonthlySalary();
		employee1.setMonthlySalary(raise);

		raise = employee2.getMonthlySalary();
		raise = raise * .10 + employee2.getMonthlySalary();
		employee2.setMonthlySalary(raise);

		employee1.displayYearlySalary();
		employee2.displayYearlySalary();

	}// end main
} // end class EmployeeTest