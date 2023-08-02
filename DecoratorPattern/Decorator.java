package DecoratorPattern;

public abstract class Decorator extends Item {
	protected Item item;

	public Decorator(Item item) {
		this.item = item;
	}
}
