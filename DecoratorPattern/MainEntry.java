package DecoratorPattern;

public class MainEntry {
	public static void main(String[] args) {
		Strings strings = new Strings();

		strings.add("We can go wherever you like");
		strings.add("Baby, say the words and I'm down");
		strings.add("All I need is you on my side");
		strings.add("We can go whenever you like, now where are you?");
		strings.add("what's your ETA, what's your ETA?");

		System.out.println("------------------------------------------------------");
		strings.print();

		Item decorator = new SideDecorator(strings, '\"');
	
		System.out.println("------------------------------------------------------");
		decorator.print();
		decorator = new LineNumberDecorator(strings);
		System.out.println("------------------------------------------------------");
		decorator.print();
		decorator = new BoxDecorator(strings);
		System.out.println("------------------------------------------------------");
		decorator.print();
	}
}
