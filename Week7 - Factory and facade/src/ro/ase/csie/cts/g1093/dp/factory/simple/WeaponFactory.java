package ro.ase.csie.cts.g1093.dp.factory.simple;

public class WeaponFactory {
	public static AbstactWeapon getWeapon(WeaponType type, String color) {
		AbstactWeapon weapon = null;
		switch (type) {
		case PISTOL:
			weapon = new Pistol(color, 100);
			break;
		case MACHINEGUN:
			weapon = new MachineGun(color);
		    break;
		case BAZOOKA:
			weapon = new Bazooka(color, 1000, 500);
			break;
		default:
			throw new UnsupportedOperationException();
		}
	}
}