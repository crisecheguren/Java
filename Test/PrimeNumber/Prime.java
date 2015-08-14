public class Prime
{
	public static void main(String[] args)
	{


		// number to divide
		for(int i = 1; i < 100; i++)
		{
			// flag for Primeness
			boolean isPrime = true;

			// number to divide by
			for(int n = 2; n < i; n++)
			{

				// check to see if number is prime
				if (i % n == 0) // if the remainder of i divided by n is 0
				{
					isPrime = false; // i is not prime
					System.out.println(i + " is not prime."); // let the user know
					break; // exit inner for loop
				} // end if block

			} // end inner for loop
			if (isPrime)
				System.out.println(i);
		} // end outer for loop

	} // end main
} // end class Prime