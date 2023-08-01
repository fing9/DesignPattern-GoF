package TemplatePattern;

import java.util.ArrayList;

public class Article {
	private String title;
	private ArrayList<String> content;
	private String footer;

	public Article(String title, ArrayList<String> content, String footer) {
		this.title = title;
		this.content = content;
		this.footer = footer;
	}

	public String getTitle() {
		return title;
	}

	public ArrayList<String> getContent() {
		return content;
	}

	public String getFooter() {
		return this.footer;
	}
}
