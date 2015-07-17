public class ThereAndBackAgain {
	public static void main(String[] args) {
		System.out.println("Here.");
		thingus();
		System.out.println("Back first time.");
		thingus();
		System.out.println("Back second time.");
	}

	public static void thingus(){
		System.out.println("DINGUS!");
	}
}