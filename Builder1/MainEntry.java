package Builder1;

import java.util.Random;

public class MainEntry {
	public static void main(String[] args) {
		Car car1 = new Car("V7", true, "Black", true, false);

		// Builder 패턴을 사용하면 실제 객체의 생성을 원하는 만큼 계속 지연시킬 수 있다.
		Car car2 = new CarBuilder()
			.setAEB(false)
			.setAirbag(false)
			.setCameraSensor(true)
			.setColor("White")
			.setEngine("V9")
			.build();

		CarBuilder carbBuilder = new CarBuilder()
			.setAEB(false)
			// .setAirbag(false)
			.setCameraSensor(true)
			.setColor("White")
			.setEngine("V9");
			// .build();

		Random random = new Random();
		Car car3 = carbBuilder
			.setAirbag(random.nextInt(2) == 0) // 50% 확률로 에어백 여부 
			.build();
		
			System.out.println(car1);
			System.out.println(car2);
			System.out.println(car3);
	}
}
