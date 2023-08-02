package Composite;

public abstract class Unit {
	private String name;

	public Unit(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name + "(" + getSize() + ")";
	}

	// Unit은 폴더와 파일인데, 둘은 사이즈를 구하는 방법이 다르므로 abstract 클래스이다.
	public abstract int getSize();
}