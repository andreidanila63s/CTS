package recap_semBoja.factory;


public abstract class AbstractWeapon {
	
	String color;
	int power;
	
	
	public AbstractWeapon(String color, int power) {
		this.color = color;
		this.power = power;
	}

	public abstract void pewPew();
	
}