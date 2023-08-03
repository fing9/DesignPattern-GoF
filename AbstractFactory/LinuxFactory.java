package AbstractFactory;

public class LinuxFactory extends ComponentFactory {

	@Override
	public Button createButton(String caption) {
		return new LinuxButton(caption);
	}

	@Override
	public CheckBox createCheckBox(boolean bChecked) {
		return new LinuxCheckBox(bChecked);
	}

	@Override
	public TextEdit createTextEdit(String value) {
		return new LinuxTextEdit(value);
	}
	
}
