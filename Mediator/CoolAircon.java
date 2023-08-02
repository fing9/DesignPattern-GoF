package Mediator;

public class CoolAircon extends Participant{
	private boolean bOff = true;

	public CoolAircon(Mediator mediator) {
		super(mediator);
	}

	public void on() {
		if (!bOff) return;
		bOff = false;

		mediator.participantChanged(this);
	}

	public void off() {
		if (bOff) return;
		bOff = true;

		mediator.participantChanged(this);
	}

	public boolean isRunning() {
		return !bOff;
	}

	@Override
	public String toString() {
		if (bOff) return "# 에어컨: 꺼짐";
		else return "# 에어컨: 켜짐";
	}
}
