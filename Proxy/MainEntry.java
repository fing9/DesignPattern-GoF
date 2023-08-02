package Proxy;

public class MainEntry {
	public static void main(String[] args) {
		// Display display = new ScreenDisplay();
		Display display = new BufferDisplay(3);

		display.print("We can go wherever you like");
		display.print("Baby, say the words and I'm down");
		display.print("All I need is you on my side");
		display.print("We can go whenever you like, now where are you?");
		display.print("what's your ETA, what's your ETA?");

		((BufferDisplay)display).flush();
	}
}
