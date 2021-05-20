package ro.ase.cts.g1093.dp.observer;

public class UserNotificationsModule implements ConnectionStatusInterface{

	@Override
	public void connectionUp() {
		System.out.println("popUp: connection active");
		
	}

	@Override
	public void connectionDown() {
		System.out.println("popup: connection lost");
		
	}
	
	

}
