package FactoryMethod;

public class Shield implements Item {

	@Override
	public void use() {
		System.out.println("방패로 깡! 막았다.");
	}
	
}
