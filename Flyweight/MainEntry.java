package Flyweight;

public class MainEntry {
	public static void main(String[] args) {
		Number number = new Number(1234567890);
		clearScreen();
		number.print(1, 10);

		System.out.println();
		System.out.println();
		System.out.println();
	}
	
	public static void clearScreen() {
		for (int i = 0; i < 10; i++)
			System.out.println("");
	}

}
