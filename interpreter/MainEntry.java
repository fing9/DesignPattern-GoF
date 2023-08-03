package Interpreter;

public class MainEntry {
	public static void main(String[] args) {
		String script = "BEGIN FRONT LOOP 2 BACK RIGHT END BACK END";
		System.out.println(script);

		Context context = new Context(script);
		Expression expression = new BeginExpression();

		if (expression.parse(context)) {
			System.out.println(expression);

			expression.run();
		}

		// while(true) {
		// 	String keyword = context.getCurrentKeyword();
		// 	if (keyword == null) break;

		// 	System.out.println(keyword);

		// 	context.readNextKeyword();
		// }
	}
}
