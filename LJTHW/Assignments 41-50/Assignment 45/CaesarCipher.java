import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class CaesarCipher {
	/**
	* Returns the character shifted by the given number of letters.
	*
	* STUDY DRILL:
	*Make a new version of this exercise that gets the message from a text file instead and creates an “encrypted” file with the ciphertext instead of just printing it on the screen.
	*/

	public static char shiftLetter( char c, int n ) {
		int ch = c;

		if ( ! Character.isLetter(c) )
			return c;

		ch = ch + n;

		if ( Character.isUpperCase(c) && ch > 'Z' || Character.isLowerCase(c) && ch > 'z' )
			ch -= 26;
		if ( Character.isUpperCase(c) && ch < 'A' || Character.isLowerCase(c) && ch < 'a')
			ch += 26;

		return (char)ch;
	}

	public static void main(String[] args) throws Exception{
		Scanner keyboard = new Scanner(System.in);
		PrintWriter encrypted;

		int shift;
		String message,
			   cipher = "";



		Scanner messageIn = new Scanner( new File("message.txt") );
		System.out.println("Getting secret message from file.");
		message = messageIn.nextLine();
		System.out.println("Done.");
		// System.out.println("The message is " + "\"" + message + "\"");


		System.out.println("Shift (0-26):  ");
		shift = keyboard.nextInt();

		for ( int i = 0; i < message.length(); i++ ) {
			cipher += shiftLetter( message.charAt(i), shift );
		}

		// System.out.println(cipher);

		encrypted = new PrintWriter( new FileWriter( "encrypted.txt") );
		encrypted.println(cipher);
		encrypted.close();
	}
}