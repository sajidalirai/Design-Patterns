package builder;

public class BuilderDemo {
	
	public static void main(String[] args) {
		Meal vegetarianMeal = new Meal();
		vegetarianMeal.addItem(new ChickenSanwitch());
		vegetarianMeal.addItem(new Papsi());
		
		System.out.println("Vagetarian Food");
		vegetarianMeal.display();
		System.out.println("Total Price = " + vegetarianMeal.price());
		
		
		
		

	}
}
