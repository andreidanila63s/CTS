package recap_semBoja.decorator;

import recap_semBoja.adapter.ACMECharacter;
import recap_semBoja.adapter.FantasyCharacter;


public class TestDecorator {

	public static void main(String[] args) {
		
		ACMECharacter dragon = new FantasyCharacter("Blue dragon", 1000);
		dragon.move();
		dragon.takeAHit(700);
		dragon.heal(100);
		
		
		//don't
		/*
		 * ACMECharacter dragonWithArmor = new ArmorDecorator(dragon, 200);
		 * dragonWithArmor.takeAHit(300);
		 */
		
		dragon = new ArmorDecorator(dragon, 200);
		dragon.takeAHit(300);
		
		dragon = new WoundedDecorator(dragon);
		dragon.takeAHit(300);
		dragon.move();
		
		dragon.takeAHit(400);
		dragon.move();
		
		ACMECharacter dragon2 = new FantasyCharacter("Yellow dragon", 1000);
		dragon2.move();
		dragon2.takeAHit(200);
		dragon2.heal(100);
		
	}

}