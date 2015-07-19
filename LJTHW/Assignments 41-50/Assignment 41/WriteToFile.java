import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) {
		PrintWriter fileout;

		try {
		fileout = new PrintWriter( new FileWriter("write.txt") );
		} catch (IOException ex) {
			System.out.println("ERROR: I don't have permission to write this file.");
			fileout = null;
			System.exit(1);
		}
		fileout.println("Hey, this is a test.");
		fileout.println("We're writing to file!");
		fileout.close();
	}
}