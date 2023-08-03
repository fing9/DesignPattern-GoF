package Visitor;

import java.util.ArrayList;
import java.util.Iterator;

public class ItemList implements Unit {
	private ArrayList<Unit> list = new ArrayList<Unit>();

	public void add(Unit unit) {
		list.add(unit);
	}

	@Override
	public void accept(Visitor visitor) {
		Iterator<Unit> iter = list.iterator();

		while (iter.hasNext()) {
			Unit unit = iter.next();
			visitor.visit(unit);
		}
	}
}
