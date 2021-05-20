package ro.ase.cts.g1093.dp.observer;

public class BackupModule implements ConnectionStatusInterface{

	@Override
	public void connectionUp() {
		System.out.println("display restore points");
	}

	@Override
	public void connectionDown() {
		System.out.println("create a restore point");
	}

}
