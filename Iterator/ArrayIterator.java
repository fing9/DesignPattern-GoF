public class ArrayIterator implements Iterator{
	private Array array;
	private int index;

	public ArrayIterator(Array array) {
		this.array = array;
		this.index = -1;
	}

	// 다음 item이 존재하는지 여부
	@Override
	public boolean next() {
		index++;
		return index < array.getCount();
	}

	// 현재 Iterator가 가르키는 item 반환
	@Override
	public Object current() {
		return array.getItem(index);
	}

}
