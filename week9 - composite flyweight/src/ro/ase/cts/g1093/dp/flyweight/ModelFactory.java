package ro.ase.cts.g1093.dp.flyweight;

import java.util.HashMap;

public class ModelFactory {

	static HashMap<String, Model3DInterface> models = new HashMap<>();
	
	static {
		models.put(ModelType.BUILDING.toString(), new Model3DFlyweight("Building"));
		models.put(ModelType.SOLDIER.toString(),new Model3DFlyweight("soldier") );
		
	}
	
	public static Model3DInterface getModel(ModelType type) {
		return models.get(type.toString());
	}
}
