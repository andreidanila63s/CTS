package ro.ase.cts.g1093.dp.memento;

public class TestMemento {
	
	public static void main(String[] args) {
		SuperHero superman = new SuperHero(100, "superman", "fly");
		
		HeroMemento initialSave= superman.createRestorePoint();
		
		superman.takeAHit(50);
		superman.takeAHit(34);
		
		System.out.println("lifepoints: "+ superman.lifepoints);
		
		superman.restore(initialSave);
		
		System.out.println("lifepoint:" + superman.lifepoints);
	}

}
