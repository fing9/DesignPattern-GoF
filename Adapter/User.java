package Adapter;

import java.util.ArrayList;

public class User {
	public static void main(String[] args) {
		ArrayList<Animal> animals = new ArrayList<Animal>();
		animals.add(new Dog("댕댕이"));
		animals.add(new Cat("양식이"));
		animals.add(new Cat("양식이마크투"));
		// Tiger 클래스를 직접적인 수정없이 추가하고 싶음. -> Adapter 클래스를 이용
		// animals.add(new Tiger("호랭이")); <- error
		animals.add(new TigerAdapter("호랭이"));

		animals.forEach(animal -> {
			animal.sound();
		});
	}
}
