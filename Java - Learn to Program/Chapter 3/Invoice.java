/*
(Invoice Class) Create a class called Invoice that a hardware store might use to represent an invoice for an item
sold at the store.

An Invoice should include four pieces of information as instance variables—a part number (type String),
a part description (type String), a quantity of the item being purchased (type int) and a price per item (double).

Your class should have a constructor that initializes the four instance variables. Provide a set and a get method for each
instance ariable.

In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e., multiplies
the quantity by the price per item), then returns the amount as a double value. If the quantity is not positive,
it should be set to 0. If the price per item is not positive, it should be set to 0.0.

Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.
*/
public class Invoice
{
	// instance variables
	private String partNumber;
	private String description;
	private int quantity;
	private double price;

	// invoice constructor
	public Invoice(String partNumber, String description, int quantity, double price)
	{
		this.partNumber = partNumber;
		this.description = description;
		this.quantity = quantity;
		this.price = price;
	} // end Invoice Constructor

	// display invoice method
	public void displayInvoice()
	{
		System.out.printf("Part Number:  %s%nDescription:  %s%n%nQuantity:  %d%n%nPrice:  $%.2f%n%n", partNumber, description, quantity, price);
	} // end method displayInvoice

	// method to set the part number
	public void setPartNumber(String partNumber)
	{
		this.partNumber = partNumber;
	} // end method setPartNumber

	// method to get part number
	public String getPartNumber()
	{
		return partNumber; // return value of partNumber to caller
	}
} // end class invoice