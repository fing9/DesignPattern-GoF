package ChainOfResponsibility;

public abstract class Handler {
	protected Handler nexHandler = null;

	public Handler setNext(Handler handler) {
		this.nexHandler = handler;
		return handler;
	}

	protected abstract void process(String url);

	public void run(String url) {
		process(url);
		// 연결된 책임대로 순차적으로 실행시킨다.
		if (nexHandler != null) nexHandler.run(url);
	}
}
