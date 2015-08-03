import java.util.Scanner;

public class InvoiceTest
{
	public static void main(String[] args)
	{
		int menuChoice;
		Invoice hammer = new Invoice("PN80294555", "A handy hammer, used for hitting.", 1, 10.00); // create a hammer to test
		Scanner keyboard = new Scanner(System.in); // create a Scanner for input from keyboard
		do
		{
			System.out.println("Welcome to the Invoice Menu (1-7)");
			System.out.println("1) View Hammer\n2) Set Part Number\n3) Set Description\n4) Set Quantity\n5) Set Price\n6) Get Invoice Amount\n7) Exit");
			menuChoice = keyboard.nextInt();
			if (menuChoice == 1)
			{
				System.out.println();
				hammer.displayInvoice();
			} // end menuChoice == 1 block
			else if (menuChoice == 2)
			{
				System.out.println("New Part Number:  ");
				String partNumber = keyboard.next();
				hammer.setPartNumber(partNumber);
				System.out.println("Part Number changed to:  " + hammer.getPartNumber());
			} // end menuChoice == 2 block
			else if (menuChoice == 3)
			{
				System.out.println("New Description:  ");
				keyboard.nextLine();
				String description = keyboard.nextLine();
				hammer.setDescription(description);
				System.out.println("Description changed to:  " + hammer.getDescription());
			} // end menuChoice == 3 block
			else if (menuChoice == 4)
			{
				System.out.println("New Quantity:  ");
				int quantity = keyboard.nextInt();
				hammer.setQuantity(quantity);
				System.out.println("Quantity changed to:  " + hammer.getQuantity());
			} // end menuChoice == 4 block
			else if (menuChoice == 5)
			{
				System.out.println("New Price:  ");
				double price = keyboard.nextDouble();
				hammer.setPrice(price);
				System.out.printf("Price changed to:  $%.2f%n%n", hammer.getPrice());
			} // end menuChoice == 5 block
			else if (menuChoice == 6)
			{
				System.out.println("Calculating Invoice Amount...");
				System.out.println("...");
				System.out.println("..");
				System.out.println("...\n");
				System.out.printf("$%.2f%n%n", hammer.getInvoiceAmount());

			} // end menuChoice == 6 block
		} // end do
		while (menuChoice != 7);

	} // end main
} // end class Invoice test