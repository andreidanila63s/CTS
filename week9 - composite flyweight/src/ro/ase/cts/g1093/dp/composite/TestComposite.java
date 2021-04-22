package ro.ase.cts.g1093.dp.composite;

public class TestComposite {
	
	public static void maine(String[] args) {
		
		Group group1 = new Group("red team");
		group1.addNode(new NPC("soldier1", 100));
		group1.addNode(new NPC("soldier2", 100));
		
		AbstractNode group2 = new Group("blue team");
		group2.addNode(new NPC("soldier3", 150));
		group2.addNode(new NPC("soldier4", 300));
		
		AbstractNode levelGroup = new Group("Level 2");
		levelGroup.addNode(new NPC("Level Boss", 500));
		levelGroup.addNode(group1);
		levelGroup.addNode(group2);
		
		levelGroup.attack("Superman");
		levelGroup.retreat();
		levelGroup.getNode(0).move();

	}

}
