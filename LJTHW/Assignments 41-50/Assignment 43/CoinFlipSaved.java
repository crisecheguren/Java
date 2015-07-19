import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CoinFlipSaved {
	public static void main(String[] args) throws Exception {
		Scanner keyboard = new Scanner (System.in);

		String coin,
			   again,
			   bestName,
			   saveFile = "coinflip_score.txt";

		int    flip,
			   streak = 0,
			   best;

		File in = new File(saveFile);
		if ( in.createNewFile() ) {
			System.out.println("Your game file doesn't exist.  Created.");
			best = -1;
			bestName = "";
		} else {
			Scanner input = new Scanner(in);
			bestName = input.next();
			best = input.nextInt();
			input.close();
			System.out.println( "High score is " + best + " flips in a row by " + bestName );
		}

		do {
			flip = 1 + (int)(Math.random() * 2 );

			if (flip == 1 )
				coin = "HEADS";
			else
				coin = "TAILS";

			System.out.println( "You flip a coin and it is... " + coin );

			if ( flip == 1 ) {
				++streak;
				System.out.println( "\tThat's " + streak + " in a row..." );
				System.out.print( "\tWould you like to flip again (y/n)?  " );
				again = keyboard.next();
			} else {

				again = "n";
			}
		} while ( again.equals("y") );

		System.out.println( "Final score:  " + streak );

		if ( streak > best ) {
			System.out.println("That's a new high score!");
			System.out.print("Your name:  ");
			bestName = keyboard.next();
			best = streak;

			PrintWriter out = new PrintWriter( new FileWriter(saveFile) );
			out.println(bestName);
			out.println(best);
			out.close();

		} else if (streak == best) {
			System.out.println("That ties the high score. Cool.");
		} else {
			System.out.println("You'll have to do better than " + best + " if you want a high score.");
		}

		//Save this name and high score to the file.



	}
}