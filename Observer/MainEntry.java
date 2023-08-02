package Observer;

public class MainEntry {
	public static void main(String[] args) {
		DiceGame diceGame = new FairDiceGame();
		DiceGame diceGame2 = new UnfairDiceGame();

		Player player1 = new EvenBettingPlayer("짝수좋아맨");
		Player player2 = new OddBettingPlayer("홀수좋아맨");
		Player player3 = new OddBettingPlayer("홀아비");

		diceGame.addPlayer(player1);
		diceGame.addPlayer(player2);
		diceGame.addPlayer(player3);

		for (int i=0;i<5;i++) {
			diceGame.play();
			System.out.println();
		}

		System.out.println("-----------------------------------");

		Player player4 = new NBettingPlayer("1번맨", 1);
		Player player5 = new NBettingPlayer("2번맨", 2);
		Player player6 = new NBettingPlayer("3번맨", 3);
		Player player7 = new NBettingPlayer("4번맨", 4);
		Player player8 = new NBettingPlayer("5번맨", 5);
		Player player9 = new NBettingPlayer("6번맨", 6);

		diceGame2.addPlayer(player4);
		diceGame2.addPlayer(player5);
		diceGame2.addPlayer(player6);
		diceGame2.addPlayer(player7);
		diceGame2.addPlayer(player8);
		diceGame2.addPlayer(player9);

		for (int i=0;i<10;i++) {
			diceGame2.play();
			System.out.println();
		}
	}
}
