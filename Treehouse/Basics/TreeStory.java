import java.io.Console;

public class TreeStory {
	public static void main(String[] args) {
		Console console = System.console();

	/*
		Some terms:
		noun: Person, place or thing
		verb: An action
		adjective - A description used to modify or describe a noun
		Enter your amazing code here!
	*/
		int age = Integer.parseInt(console.readLine("Enter your age:  "));

		if (age < 13) {
			console.printf("You're not old enough, sorry.\n");
			System.exit(0);
		}

			String name = console.readLine("Enter your name:  ");
			String adjective = console.readLine("Enter an adjective:  ");
			String noun;
			String bad = "fuck, shit, bitch, jerk, dork";
			boolean isInvalidWord;
			do {
				noun = console.readLine("Enter a noun:  ");
				isInvalidWord = bad.contains(noun.toLowerCase());
				if (isInvalidWord) {
					console.printf("BE NICE AND TRY AGAIN!\n\n");

				}
			} while (isInvalidWord);
			String adverb = console.readLine("Enter an adverb:  ");
			String verb = console.readLine("Enter a verb ending in -ing:  ");


			console.printf("Your TreeStory:\n--------------\n");
			console.printf("%s is a %s %s.  ", name, adjective, noun);
			console.printf("They are always %s %s.\n", adverb, verb);

	}
}