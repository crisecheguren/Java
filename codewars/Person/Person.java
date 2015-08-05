public class Person {
	String name;
	String yourName;
	public Person(String personName) {
		name = personName;
	}

	public String greet(String yourName) {
		return String.format("Hi %s, my name is %s", name, yourName);
	}
}