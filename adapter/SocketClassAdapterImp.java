package adapter;

public class SocketClassAdapterImp extends Socket implements SocketAdapter{

	@Override
	public Volt get120Volt() {
		return getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt v = getVolt();
		return convertVolt(v,10);
		
	}

	@Override
	public Volt get4Volt() {
		Volt v = getVolt();
		return convertVolt(v, 40);
	}
	
	
	public Volt convertVolt(Volt v, int devidor) {
		return new Volt(v.getVolt()/devidor);
	}

}
