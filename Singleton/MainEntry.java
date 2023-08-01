package Singleton;

public class MainEntry {
	public static void main(String[] args) {
		// King king = new King(); <- error : 외부에서는 생성할 수 없음
		King king = King.getInstance();

		king.say();

		King king2 = King.getInstance();
		if (king == king2) {
			System.out.println("same object");
		} else {
			System.out.println("different object");
		}
	}
}
