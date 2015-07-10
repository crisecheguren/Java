import java.util.Scanner;

public class IfApp implements Runnable {

	public void run() {
		System.out.println("Thread?");
	}

	//Print instructions and get input
	public static int userNumber() {
		System.out.println("Enter a number from 1 - 100");
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		return n1;

	}

	public static void main(String[] args){
		(new Thread(new IfApp())).start();

		userNumber();
		int a = userNumber();

		if( a > 100 ) {
			System.out.println("You entered " + a + " which is greater than 100. Can't follow simple directions, eh?");
		try {
			Thread.sleep(3000);
		} catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		System.out.println("Let's try again");
		try {
			Thread.sleep(3000);
		}
			catch(InterruptedException ex) {
				Thread.currentThread().interrupt();
		}
			System.out.println("Enter a number from 1 - 100");

		}

	}




		// //if numbers are legit, it will tell you which is greater
		// //if not, it will ask again
		// if( a > 100 ) {
		// 	System.out.println("You entered " + a + " which is greater than 100. Can't follow simple directions, eh?");
		// 	try {
		// 		Thread.sleep(3000);
		// 	} catch(InterruptedException ex) {
		// 		Thread.currentThread().interrupt();
		// 	}
		// 	System.out.println("Let's try again");
		// 	try {
		// 		Thread.sleep(3000);
		// 	} catch(InterruptedException ex) {
		// 		Thread.currentThread().interrupt();
		// 	}
		// 	System.out.println("Enter a number from 1 - 100");
		// 	a = in.nextInt();
		// }

		// System.out.println("Enter a number from 1 - 100");
		// b = in.nextInt();
		// System.out.println("You entered " + b);


}