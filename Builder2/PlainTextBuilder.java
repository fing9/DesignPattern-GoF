package Builder2;

public class PlainTextBuilder extends Builder {
	
	public PlainTextBuilder(Data data) {
		super(data);
	}

	@Override
	public String head() {
		return "";
	}

	@Override
	public String body() {
		StringBuilder sb = new StringBuilder();

		sb.append("Name: ");
		sb.append(data.getName());
		sb.append(", Age: ");
		sb.append(data.getAge());

		return sb.toString();
	}

	@Override
	public String foot() {
		return "";
	}
	
}
