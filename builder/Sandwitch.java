package builder;

public abstract class Sandwitch implements Item{

	@Override
	public Packing packing() {
		return new Wrapper();
	}

	@Override
	public abstract double price();

}
