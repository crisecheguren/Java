//Fig 3.1 Account.java
// Account class that contains a "name" instance variable
// and methods to set and get its value.

public class Account
{
	private String name; // instance variable

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
} // end class Account