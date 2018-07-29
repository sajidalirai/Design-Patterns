package singleton;

public class Singleton {
	
	private static Singleton instance;
	private Singleton() {
		System.out.println("first instace");
	}
	
	public static Singleton getInstance() {
		if(instance == null) {
			instance = new Singleton();
		}
		return instance;
	}
	
	public void display() {
		System.out.println("Display Method");
	}

}
