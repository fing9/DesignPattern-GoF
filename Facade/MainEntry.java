package Facade;

public class MainEntry {
	public static void main(String[] args) {
		Facade facade = new Facade();
		// DBMS dbms = new DBMS();
		// Cache cache = new Cache();

		String name = "Dorosh";

		facade.run(name); // 복잡한 관계를 블랙박스화 해서 사용가능하게 만들었다.
		// Facade로 코드를 감싸기위해 이동
		// Row row = cache.get(name);
		// if (row == null) {
		// 	row = dbms.query(name);
		// 	if (row != null) {
		// 		cache.put(row);
		// 	}
		// }

		// if (row != null) {
		// 	Message message = new Message(row);

		// 	System.out.println(message.makeName());
		// 	System.out.println(message.makeBirthday());
		// 	System.out.println(message.makeEmail());
		// } else {
		// 	System.out.println(name + " is not exists.");
		// }
	}
}
