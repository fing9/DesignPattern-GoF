package AbstractFactory;

public abstract class Button {
	protected String caption;

	public Button(String caption) {
		this.caption = caption;
	}

	public void clickEvent() {
		System.out.println(caption + " 버튼을 클릭했습니다.");
	}

	// 화면상에 컴포넌트를 그리는 메서드, 운영체제에 따라서 랜더링 API가 달라지므로 일단은 추상 메서드로 정의되어있다.
	abstract void render();
}
