package singleton;

public class TestSingleton {
	
	public static void main(String[] args) {
		Singleton instance = Singleton.getInstance();
		instance.display();
	}

}
