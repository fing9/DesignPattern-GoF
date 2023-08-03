package Interpreter;

public abstract class CommandExpression implements Expression {
	protected String keyword;

	public CommandExpression(String keyword) {
		this.keyword = keyword;
	}
}
