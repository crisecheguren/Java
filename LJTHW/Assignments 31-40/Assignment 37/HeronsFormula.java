public class HeronsFormula {
	public static void main(String[] args) {
		double a;

		a = triangleArea(3, 3, 3);
		System.out.println("A triangle with sides 3, 3, 3 has an area of " + a);

		a = triangleArea(3, 4, 5);
		System.out.println("A triangle with sides 3, 4, 5 has an area of " + a);

		a = triangleArea(7, 8, 9);
		System.out.println("A triangle with sides 7, 8, 9 has an area of " + a);

		System.out.println("A triangle with sides 5, 12, 13 has an area of " + triangleArea(5, 12, 13));

		System.out.println("A triangle with sides 10, 9, 11 has an area of " + triangleArea(10, 9, 11));

		System.out.println("A triangle with sides 8, 15, 17 has an area of " + triangleArea(8, 15, 17));

		System.out.println("A triangle with sides 9, 9, 9 has an area of " + triangleArea(9, 9, 9));
	}

	public static double triangleArea ( double a, double b, double c ) {
		// the code in this function computes the are of a triangle with sides a, b, and c.
		double s, A;

		s = (a + b + c) / 2;
		A = Math.sqrt( s * ( s - a ) * ( s - b ) * (s - c) );

		return A;
	}
}