package TemplatePattern;

public abstract class DisplayArticleTemplate {
	protected Article article;

	public DisplayArticleTemplate(Article article) {
		this.article = article;
	}

	// 순서를 지정해준다.
	public final void display() {
		title();
		content();
		footer();
	}

	protected abstract void title();
	protected abstract void content();
	protected abstract void footer();
}
