public class CreatingVariables {

	public static void main(String[] args) {
		int x, y, age;
		double seconds, e, checking;
		String firstName, last_name, title;

		x = 10;
		y = 400;
		age = 39;

		seconds = 4.79;
		e = 2.71829382910293839029;
		checking = 1.89;

		firstName = "Graham";
		last_name = "Mitchell";
		title = "Mr.";

		System.out.println( "The variable x contains " + x );
		System.out.println( "The value of " + y + " is stored in the variable y" );
		System.out.println( "The experiment completed in " + seconds + "seconds" );
		System.out.println( "My favorite irrational number in Euler's constant: " + e );
		System.out.println(	"Hopefully, your balance is more than $" + checking + "!" );
		System.out.println( "My full name is " + title + " " + firstName + " " + last_name );
	}
}