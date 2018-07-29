package factory;

public class TestFactory {
	
	public static void main(String[] args) {
		
		Computer computer = ComputerFactory.getComputer("pc", "3GB", "255GB", "2.5GHz");
		Computer computer2 = ComputerFactory.getComputer("server", "48GB", "2 TB", "5 THz");
		
		System.out.println("Computer 1 Properties "+ computer);
		System.out.println("Computer 2 properties "+ computer2);
		
		
	}

}
