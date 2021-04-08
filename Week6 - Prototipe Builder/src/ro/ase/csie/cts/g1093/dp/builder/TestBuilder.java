package ro.ase.csie.cts.g1093.dp.builder;

public class TestBuilder {

	public static void main(String[] args) {

		//create the object 
	//	SuperHero superHero = new SuperHero();
		// init it
	//	SuperHero superHero2 = 
		//		new SuperHero("superman", 100, false, false, new Weapon(), null, new Flying(), null);
		
		SuperHero superman = 
				new SuperHero.SuperHeroBuilder("superman", 100).build();
		
		SuperHero joker = 
				new SuperHero.SuperHeroBuilder("joker", 200)
				.setRightWeapon(new Weapon())
				.isWounded()
				.isVillain()
				.build();		
		
		
	}

}
