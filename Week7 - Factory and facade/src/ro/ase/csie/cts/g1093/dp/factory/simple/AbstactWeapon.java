package ro.ase.csie.cts.g1093.dp.factory.simple;

public abstract class AbstactWeapon {
	
	String color;
	int power;
	
	public abstract void pewPew();

	public AbstactWeapon(String color, int power) {
		super();
		this.color = color;
		this.power = power;
	}
	
	
}
