package adapter;

public class AdapterPatternTest {
	
	public static void main(String[] args) {
		SocketImpUsingClass();
		SocketImpUsingObject();
		
	}

	private static void SocketImpUsingClass() {
		System.out.println("Implementation using Class");
		SocketAdapter socketAdapter = new SocketClassAdapterImp();
		
		Volt v3 = getVolts(socketAdapter, 3);
		Volt v12 = getVolts(socketAdapter, 12);
		Volt v120 = getVolts(socketAdapter, 120);
		
		System.out.println("v3 gives Volt = " + v3.getVolt());
		System.out.println("v3 gives Volt = " + v12.getVolt());
		System.out.println("v3 gives Volt = " + v120.getVolt());
	}
	
	private static void SocketImpUsingObject() {
		System.out.println("Implementation using Object");
		SocketAdapter socketAdapter = new SocketClassAdapterImp();
		
		Volt v3 = getVolts(socketAdapter, 3);
		Volt v12 = getVolts(socketAdapter, 12);
		Volt v120 = getVolts(socketAdapter, 120);
		
		System.out.println("v3 gives Volt = " + v3.getVolt());
		System.out.println("v3 gives Volt = " + v12.getVolt());
		System.out.println("v3 gives Volt = " + v120.getVolt());
	}
	
	private static Volt getVolts(SocketAdapter socketAdap, int i) {
		switch(i) {
		case 3: return socketAdap.get4Volt();
		case 12: return socketAdap.get12Volt();
		case 120: return socketAdap.get120Volt();
		default: return socketAdap.get120Volt();
		}
	}

}
