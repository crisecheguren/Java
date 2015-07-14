/*
Study Drills

1. Remove the else from in front of the if statement on line 27. Run the program, and enter 15.5 for the BMI. Do you see how that makes the if statement on line 27 “break rank” and no longer care about the if statements before it?

2. Instead of making the human enter their BMI directly, allow them to type in their height and weight and compute the BMI for them.

*/

import java.util.Scanner;

public class BMICategories {
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


		System.out.print( "BMI Category:  " );
		if ( bmi < 15.0 ) {
			System.out.println( "very severely underweight" );
		}
		else if ( bmi < 16.0 ) {
			System.out.println( "severely underweight" );
		}
		else if ( bmi < 18.5 ) {
			System.out.println( "underweight" );
		}
		else if ( bmi < 25.0 ) {
			System.out.println( "normal weight" );
		}
		else if ( bmi < 30.0 ) {
			System.out.println( "overweight" );
		}
		else if ( bmi < 35.0 ) {
			System.out.println( "moderately obese" );
		}
		else if ( bmi < 40.0 ) {
			System.out.println( "severely obese" );
		}
		else {
			System.out.println( "very severely/\"morbidly\" obese" );
		}
	}
}