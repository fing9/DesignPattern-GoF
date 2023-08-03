package CommandPattern;

import java.util.ArrayList;

public class CommandGroup implements Command {
	private ArrayList<Command> commands = new ArrayList<Command>();

	public void add(Command command) {
		commands.add(command);
	}

	@Override
	public void run() {
		int cntCommands = commands.size();
		for (int i=0;i<cntCommands;i++) {
			Command command = commands.get(i);
			command.run();
		}
	}
}
