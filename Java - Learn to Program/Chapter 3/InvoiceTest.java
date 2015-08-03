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
			System.out.println("Welcome to the Invoice Menu (1-6)");
			System.out.println("1) View Hammer\n2) Set Part Number\n3) Set Description\n4) Set Quantity\n5) Set Price\n6) Exit");
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
			} // end menuChoice == 2 block
		} // end do
		while (menuChoice != 6);

	} // end main
} // end class Invoice test