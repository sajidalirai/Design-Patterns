package adapter;

public class SocketObjectAdapterImp implements SocketAdapter{
	
	private Socket s = new Socket();
	
	@Override
	public Volt get120Volt() {
		return s.getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = s.getVolt();
		return convertVolt(v, 10);
	}

	@Override
	public Volt get4Volt() {
		Volt v = s.getVolt();
		return convertVolt(v,40);
	}
	
	
	public Volt convertVolt(Volt v, int i) {
		return new Volt(v.getVolt()/i);
	}
	
	
	
	

}
