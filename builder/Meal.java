package builder;

import java.util.ArrayList;
import java.util.List;

public class Meal {
	
	private List<Item> items = new ArrayList<>();
	
	public void addItem(Item item) {
		items.add(item);
	}
	
	public double price() {
		double totalPrice = 0;
		for(Item item: items) {
			totalPrice += item.price();
		}
		return totalPrice;
	}
	
	public void display() {
		for(Item item:items) {
			System.out.print("Item "+ item.name());
			System.out.print(", Packing "+ item.packing().pack());
			System.out.println(", Price "+ item.price());
		}
	}
	
	

}
