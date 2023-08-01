package Bridge;

public class Publication extends Draft {
	private String publisher;
	private int cost;

	public Publication(String title, String author, String[] content, String publisher, int cost) {
		super(title, author, content);
		this.publisher = publisher;
		this.cost = cost;
	}

	private void printPublicationInfo() {
		System.out.println("#" + publisher + " $" + cost);
	}

	public void print(Display display) {
		super.print(display);
		printPublicationInfo();
	}
}
