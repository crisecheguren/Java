public class Example {

	public static void main (String[] args) {
		System.out.println("We are making a Pez Dispenser.");
		PezDispenser dispenser = new PezDispenser("Yoda");
		System.out.printf("The dispenser character is %s\n", dispenser.getCharacterName());

		if (dispenser.isEmpty()) {
			System.out.println("It is currently empty.");
		}
		System.out.println("Loading...");
		dispenser.load();
		if(!dispenser.isEmpty()) {
			System.out.println("It is no longer empty.");
		}
		while(dispenser.dispense()) {
			System.out.println("Chomp!");
		}
		if (dispenser.isEmpty()) {
			System.out.println("Ate all the pez!");
		}
		dispenser.load(4);
		dispenser.load(2);
		while(dispenser.dispense()) {
			System.out.println("Chomp!");
		}
		try {
			dispenser.load(400);
			System.out.println("this will never happen");
		} catch (IllegalArgumentException ex) {
			System.out.println("whoa there!");
			System.out.printf("The error was %s\n", ex.getMessage());
		}
	}
}