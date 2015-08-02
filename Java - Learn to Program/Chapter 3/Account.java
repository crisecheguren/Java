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

	public void displayAccount()
	{
		System.out.printf("%s balance: $%.2f%n", name, balance);
	}
} // end class Account