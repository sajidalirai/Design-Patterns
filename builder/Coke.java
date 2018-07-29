package builder;

public class Coke extends ColdDrink{

	@Override
	public String name() {
		return "Coke";
	}

	@Override
	public double price() {
		return 45.0;
	}

}
