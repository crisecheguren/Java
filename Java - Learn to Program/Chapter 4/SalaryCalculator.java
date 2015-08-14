import java.util.Scanner;

public class SalaryCalculator
{
	public static void main(String[] args)
	{
		String choice = "no"; // initialize choice to no to avoid infinite loop
		String name = ""; // initialize name to empty string
		int hoursWorked = 0; // initialize hours worked to 0
		double wage = 0.0; // initialize wage to 0.0

		int employeeCounter = 3; // using a counter to count down instead of adding employees to collection

		// instantiating the three employee objects (empty)
		Employee employee1 = new Employee(null, 0, 0.0);
		Employee employee2 = new Employee(null, 0, 0.0);
		Employee employee3 = new Employee(null, 0, 0.0);
		// Scanner to take input
		Scanner keyboard = new Scanner(System.in);

		System.out.println("Welcome to the Salary Calculator\n");
		System.out.println("Would you like to add an employee? (yes/no)");
		choice = keyboard.next();

		while (choice.equals("yes") && employeeCounter > 0)
		{
			System.out.print("\nEnter employee name:  ");

			System.out.println();
			keyboard.nextLine();
			name = keyboard.nextLine();


			System.out.println("\nEnter hours worked this week:  ");
			hoursWorked = keyboard.nextInt();
			System.out.print("\nEnter hourly wage:  $");
			wage = keyboard.nextDouble();

			if (employeeCounter == 3)
			{
				employee1 = new Employee(name, hoursWorked, wage);
			}
			else if (employeeCounter == 2)
			{
				employee2 = new Employee(name, hoursWorked, wage);
			}
			else if (employeeCounter == 1)
			{
				employee3 = new Employee(name, hoursWorked, wage);
			}
			employeeCounter--;

			if (employeeCounter != 0)
			{
				System.out.println("\nWould you like to add an employee? (yes/no)");
				choice = keyboard.next();
			}
			else
				choice.equals("no");

		}
		Employee.displayGrossPay(employee1);
		Employee.displayGrossPay(employee2);
		Employee.displayGrossPay(employee3);
	}
}