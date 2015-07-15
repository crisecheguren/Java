import java.util.Scanner;

public class BMICalculator {

	public static void main ( String[] args ) {

		Scanner keyboard = new Scanner(System.in);
		double m, kg, feet, bmi, inches, pounds, in;

		System.out.print( "Your height in feet(feet only):  " );
		feet = keyboard.nextDouble();

		System.out.print( "Your height in inches(inches only):  " );
		in = keyboard.nextDouble();

		System.out.print( "Your weight in pounds:  " );
		pounds = keyboard.nextDouble();


		inches = feet * 12 + in;

		m = inches / 39.37008;

		kg = pounds / 2.204623;

		bmi = kg / ( m * m );

		System.out.println( "Your BMI is " + bmi );

	}
}