package ro.ase.cts.g1093.dp.memento;

public class SuperHero {
	
	int lifepoints;
	String name;
	String magic;
	
	
	public SuperHero(int lifepoints, String name, String magic) {
		super();
		this.lifepoints = lifepoints;
		this.name = name;
		this.magic = magic;
	}
	
	public void attack() {
		System.out.println(" attacking ");
	}
	
	public void heal(int points) {
		this.lifepoints += points;
	}
	
	public void takeAHit(int points) {
		this.lifepoints -= points;
	}

	
	public HeroMemento createRestorePoint() {
		return new HeroMemento(name, lifepoints, magic);
	}
	
	public void restore(HeroMemento memento) {
		this.name = memento.name;
		this.lifepoints=memento.lifepoints;
		this.magic=memento.magic;
		
		
	}
}
