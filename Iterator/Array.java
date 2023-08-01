public class Array implements Aggregator {
	private Item[] items;

	public Array(Item[] items) {
		this.items = items;
	}

	public Item getItem(int index) {
		return items[index];
	}

	public int getCount() {
		return items.length;
	}

	@Override
	public Iterator iterator() {
		return new ArrayIterator(this);
	}

}
