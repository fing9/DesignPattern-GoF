package AbstractFactory;

public class MainEntry {
	public static void main(String[] args) {
		// 윈도우/리눅스 운영체제에 따라 컴포넌트 팩토리를 생성한다.
		// ComponentFactory factory = new WindowsFactory();
		// 리눅스 운영체제로 바꾸고 싶다면 단순히 팩토리 객체만 갈아끼워주면 된다.
		ComponentFactory factory = new LinuxFactory();

		// 팩토리를 이용해서 이후에 운영체제에 종속적인 코드를 작성하지 않을 수 있다.
		Button button = factory.createButton("확인");
		CheckBox checkBox = factory.createCheckBox(false);
		TextEdit textEdit = factory.createTextEdit("디자인패턴");

		button.render();
		checkBox.render();
		textEdit.render();

		button.clickEvent();
		checkBox.setChecked(true);
		textEdit.setValue("GoF의 디자인패턴");
	}
}
