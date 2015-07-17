public class YachtDice {
	public static void main(String[] args) {
		int roll1, roll2, roll3, roll4, roll5, roll6, tries = 0;
		boolean allTheSame;

		do {
			roll1 = 1 + (int)(Math.random() * 6);
			roll2 = 1 + (int)(Math.random() * 6);
			roll3 = 1 + (int)(Math.random() * 6);
			roll4 = 1 + (int)(Math.random() * 6);
			roll5 = 1 + (int)(Math.random() * 6);
			roll6 = 1 + (int)(Math.random() * 6);
			System.out.println("\nYou rolled:  " + roll1 + " " + roll2 + " " + roll3 + " " + roll4 + " " + roll5 + " " + roll6);
			showDice(roll1);
			showDice(roll2);
			showDice(roll3);
			showDice(roll4);
			showDice(roll5);
			showDice(roll6);
			allTheSame = (roll1 == roll2 && roll2 == roll3 && roll3 == roll4 && roll4 == roll5 && roll5 == roll6);
			tries++;
		} while (! allTheSame);
		System.out.println("The Yacht!!");
		System.out.println("It took " + tries + " attempts.");
	}
	public static void showDice(int roll) {
		System.out.println("+---+");
		if (roll == 1) {
			System.out.println("|   |");
			System.out.println("| O |");
			System.out.println("|   |");
		} else if(roll == 2) {
			System.out.println("|O  |");
			System.out.println("|   |");
			System.out.println("|  O|");
		} else if (roll == 3) {
			System.out.println("|O  |");
			System.out.println("| O |");
			System.out.println("|  O|");
		} else if (roll == 4) {
			System.out.println("|O O|");
			System.out.println("|   |");
			System.out.println("|O O|");
		} else if (roll == 5) {
			System.out.println("|O O|");
			System.out.println("| O |");
			System.out.println("|O O|");
		} else if (roll == 6) {
			System.out.println("|O O|");
			System.out.println("|O O|");
			System.out.println("|O O|");
		}
		System.out.println("+---+");
	}
}