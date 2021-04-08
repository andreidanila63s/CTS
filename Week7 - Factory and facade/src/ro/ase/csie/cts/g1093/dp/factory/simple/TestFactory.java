package ro.ase.csie.cts.g1093.dp.factory.simple;

public class TestFactory {
		public static void main(String[] args) {
			
			AbstactWeapon pistol = new Pistol("black", 100);
			AbstactWeapon machineGun = new MachineGun("red");
			AbstactWeapon bazooka = new Bazooka("green", 1000, 500);
			
		
		}
}
