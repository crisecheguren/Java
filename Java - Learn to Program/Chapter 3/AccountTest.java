// Chapter 3 AccountTest.java
// Creating and manipulating an Account object.
import java.util.Scanner;

public class AccountTest
{
	public static void main(String[] args)
	{
		// Create a Scanner object to obtain input from the command window.
		Scanner keyboard = new Scanner(System.in);

		// Constructing an account with Nothing in it.
		Account myAccount = new Account(null, 0.0);

		// display initial value of name (null)
		System.out.printf("Initial name is : %s%n%n", myAccount.getName());

		// prompt for and read name
		System.out.println("Please enter the name:");
		String theName = keyboard.nextLine(); // read a line of text
		myAccount.setName(theName); // put theName in myAccount
		System.out.println(); // blank line

		// display the name stored in object myAccount
		System.out.printf("Name in object myAccount is:%n%s%n", myAccount.getName());

		// Using the Account constructor to initialize the name instance variable at the time each Account object is created
		// create two account objects
		Account account1 = new Account("Jake Doe", 4.32);
		Account account2 = new Account("Jane Green", 5323.32);

		// display initial value of name for each Account
		System.out.printf("account name is: %s%n", account1.getName());
		System.out.printf("account name is: %s%n", account2.getName());
		System.out.println(account2.getName() + " has " + account2.getBalance() + " dollars.");
	}
} // end class AccountTest