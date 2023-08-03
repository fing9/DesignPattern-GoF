package AbstractFactory;

public abstract class ComponentFactory {
	public abstract Button createButton(String caption);
	public abstract CheckBox createCheckBox(boolean bChecked);
	public abstract TextEdit createTextEdit(String value);
}
