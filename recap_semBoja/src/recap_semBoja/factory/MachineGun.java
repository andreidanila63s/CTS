package recap_semBoja.factory;

public class MachineGun extends AbstractWeapon{

	public MachineGun(String color) {
		super(color, 500);
	}

	@Override
	public void pewPew() {
		System.out.println("-> -> -> -> ->");
	}

}