package Visitor;

public class AvgVisitor implements Visitor {
	private int sum = 0;
	private int count = 0;

	public double getValue() {
		try{
			return sum / count;
		} catch (ArithmeticException e) {
			e.printStackTrace();
			return 0.0;
		}
	}

	@Override
	public void visit(Unit unit) {
		if (unit instanceof Item) {
			sum += ((Item)unit).getValue();
			count++;
		} else {
			unit.accept(this);
		}
	}	
}
