import javax.swing.JOptionPane;

public class NameDialog
{
	public static void main(String[] args)
	{
		// prompt user to enter name
		String name = JOptionPane.showInputDialog("What is your name?");

		// create the message
		String message = String.format("Welcome, %s, to Java Programming!", name);

		// display a dialog with the message
		JOptionPane.showMessageDialog(null, message);
	} // end main method
} // end class Dialog1