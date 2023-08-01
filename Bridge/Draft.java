package Bridge;

public class Draft {
	private String title;
	private String author;
	private String[] content;

	public String getTitle() { return title; }
	public String getAuthor() { return author; }
	public String[] getContent() { return content; }

	public Draft(String title, String author, String[] content) {
		this.title = title;
		this.author = author;
		this.content = content;
	}

	public void print(Display display) {
		display.title(this);
		display.author(this);
		display.content(this);
	}
}
