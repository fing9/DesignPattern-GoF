package Interpreter;

public class LoopCommandExpression extends CommandExpression {
	private int count;
	private CommandListExpression expression;

	public LoopCommandExpression(String keyword) {
		super(keyword);
	}

	@Override
	public boolean parse(Context context) {
		if (!checkValidKeyword(keyword)) return false;

		String countKeyword = context.readNextKeyword();
		if (countKeyword == null) return false;

		try {
			count = Integer.parseInt(countKeyword);

			expression = new CommandListExpression();
			if (context.readNextKeyword() == null) return false;
			return expression.parse(context);
		} catch (NumberFormatException e) {
			return false;
		}
	}

	public static boolean checkValidKeyword(String keyword) {
		return keyword.equals("LOOP");
	}

	@Override
	public boolean run() {
		for (int i=0;i<count;i++) {
			if (!expression.run()) {
				return false;
			}
		}

		return true;
	}

	@Override
	public String toString() {
		return "LOOP(" + count + ")" + expression;
	}
}
