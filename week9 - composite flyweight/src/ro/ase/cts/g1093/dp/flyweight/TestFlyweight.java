package ro.ase.cts.g1093.dp.flyweight;

public class TestFlyweight {

	public static void main(String[] args) {
		
		ScreenData soldier1 = new ScreenData(100,100,0,"green 1");
		ScreenData soldier2 = new ScreenData(10, 10, 5, "blue 2");
		
		ScreenData building1 = new ScreenData(10, 10, 5, "grey");
		ScreenData bulding2 = new ScreenData(10, 10, 5, "dark grey");
		
		Model3DInterface soldierModel = ModelFactory.getModel(ModelType.SOLDIER);
		soldierModel.display(soldier1);
		soldierModel.display(soldier2);
		
		
	}

}
