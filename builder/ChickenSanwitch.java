package builder;

public class ChickenSanwitch extends Sandwitch{

	@Override
	public String name() {
		return "Chicken Sandwitch";
	}

	@Override
	public double price() {
		return 120;
	}

}
