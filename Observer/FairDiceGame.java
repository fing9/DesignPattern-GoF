package Observer;

import java.util.Iterator;
import java.util.Random;

public class FairDiceGame extends DiceGame {
	private Random random = new Random();

	@Override
	public void play() {
		int diceNumber = random.nextInt(6) + 1;
		System.out.println("주사위 던졌다~" + diceNumber);

		Iterator<Player> iter = playerList.iterator();
		while (iter.hasNext()) {
			iter.next().update(diceNumber);
		}
	}
	
}
