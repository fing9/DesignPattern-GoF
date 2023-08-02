package Observer;

public class NBettingPlayer extends Player {
	int betNbr;
	
	public NBettingPlayer(String name, int betNbr) {
		super(name);
		this.betNbr = betNbr;
	}

	@Override
	public void update(int diceNumber) {
		if (diceNumber == betNbr) {
			System.out.println(getName() + " win!");
		}
	}
	
}
