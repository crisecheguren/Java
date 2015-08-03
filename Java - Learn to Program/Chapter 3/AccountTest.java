// Chapter 3 AccountTest.java
// Creating and manipulating an Account object.
import java.util.Scanner;

public class AccountTest
{
	public static void main(String[] args)
	{
		Account account1 = new Account("Jane Green", 1000.00);
		Account account2 = new Account("John Blue", 100.53);

		// display initial balance of each object
		account1.displayAccount();
		account2.displayAccount();

		// create a Scanner object to obtain input from the command window
		Scanner keyboard = new Scanner(System.in);

		System.out.print("Enter withdraw amount for account1:  "); // prompt
		double withdrawAmount = keyboard.nextDouble(); // obtain user input

		account1.withdraw(withdrawAmount); // withdraw from account1's balance

		// display balances
		account1.displayAccount();
		account2.displayAccount();

		System.out.print("Enter deposit amount for account2:  "); // prompt
		double depositAmount = keyboard.nextDouble(); // obtain user input
		System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
		account2.deposit(depositAmount); //add to account2's balance

		// display balances
		account1.displayAccount();
		account2.displayAccount();
	} // end main
} // end class AccountTest