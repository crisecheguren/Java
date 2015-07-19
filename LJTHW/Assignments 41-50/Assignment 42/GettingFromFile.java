import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class GettingFromFile {
	public static void main(String[] args) throws Exception {
		int a, b, c, sum;
		String name;

		try {
			Scanner fileIn = new Scanner(new File("name-and-numbers.txt"));
			System.out.print("Getting name and three numbers from file... ");
			name = fileIn.nextLine();
			a = fileIn.nextInt();
			b = fileIn.nextInt();
			c = fileIn.nextInt();
			fileIn.close();
			System.out.println("done.");
			System.out.println("Your name is " + name);
			sum = a + b + c;
			System.out.println(a + "+" + b + "+" + c + "=" + sum);
		} catch (FileNotFoundException ex) {
			System.out.println("ERROR: Can't find file or lack permission to access.");
			System.exit(1);
		}
	}
}