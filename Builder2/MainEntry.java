package Builder2;

public class MainEntry {
	public static void main(String[] args) {
		Data data = new Data("Jane", 25);

		Builder builder = new PlainTextBuilder(data);
		Director director = new Director(builder);
		String ret = director.build();
		System.out.println(ret);

		builder = new JSONBuilder(data);
		director = new Director(builder);
		ret = director.build();
		System.out.println(ret);

		builder = new XMLBuilder(data);
		director = new Director(builder);
		ret = director.build();
		System.out.println(ret);
	}
}
