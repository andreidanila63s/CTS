package recap_semBoja.factory;


public class Pistol extends AbstractWeapon{

	public Pistol(String color, int power, int distance) {
		super(color, power);
	}

	@Override
	public void pewPew() {
		System.out.println("---- ----- ->");
	}

}