package Observer;

import java.util.Iterator;
import java.util.Random;

public class UnfairDiceGame extends DiceGame {
	Random random = new Random();

	@Override
	public void play() {
		int diceNumber = random.nextInt(100) + 1;
		if (diceNumber < 50) diceNumber = 1;
		else if (diceNumber < 70) diceNumber = 2;
		else if (diceNumber < 80) diceNumber = 3;
		else if (diceNumber < 85) diceNumber = 4;
		else if (diceNumber < 90) diceNumber = 5;
		else diceNumber = 6;
		System.out.println("주사위 던졌다~" + diceNumber);

		Iterator<Player> iter = playerList.iterator();
		while (iter.hasNext()) {
			iter.next().update(diceNumber);
		}
	}
	
}
