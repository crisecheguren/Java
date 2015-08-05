public class StudentTest
{
	public static void main(String[] args)
	{
			Student account1 = new Student("Jane Green", 94.3);
			Student account2 = new Student("John Blue", 63.2);

			System.out.printf("%s's letter grade is:  %s%n%s's letter grade is:  %s%n",
				account1.getName(), account1.getLetterGrade(), account2.getName(), account2.getLetterGrade());
	} // end main
} // end class StudenTest