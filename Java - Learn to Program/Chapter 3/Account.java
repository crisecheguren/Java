// Chapter 3 Account.java
// Account class with a constructor.

public class Account
{
	private String name; // instance variable
	private double balance; // instance variable

	// constructor initializes name with parameter name & balance with parameter balance
	// ** the constructor's name is the same as the class' name **
	public Account(String name, double balance)
	{
		this.name = name; // assign name to instance variable name

		// validate that the balance is greater than 0.0; if not, it keeps it's default initial value of 0.0
		if (balance > 0.0) // if balance is greater than 0.0
			this.balance = balance; // assign it to instance variable balance
	} // end constructor Account

	// method that deposits (adds) only a valid amount to the balance
	public void deposit(double depositAmount)
	{
		if (depositAmount > 0.0) // if the deposit amount is valid
			balance += depositAmount; // add depositAmount to balance
	} // end method deposit

	// method that withdraws (subtracts) only a valid amount from the balance
	public void withdraw(double withdrawAmount)
	{
		if (withdrawAmount <= balance) // if the withdraw amount is valid
		{
			System.out.printf("%nwithdrawing %.2f from account balance%n%n", withdrawAmount); // let's user know the amount is valid
			balance -= withdrawAmount; // subtract withdrawAmount from balance
		}
		else // if the withdraw amount is not valid
		{
			System.out.println("Withdrawal amount exceeded account balance.\n\n");
		}

	}

	// method returns the account balance
	public double getBalance()
	{
		return balance;
	}

	// method to set the name of the object
	public void setName(String name)
	{
		this.name = name; // store the name
	} // end method setName

	// method to retrieve the name from the object
	public String getName()
	{
		return name; // return value of name to caller
	} // end method getName

	// method to display account information
	public void displayAccount()
	{
		System.out.printf("%s balance: $%.2f%n", name, balance); // print out account information
	} // end method displayAccount

} // end class Account