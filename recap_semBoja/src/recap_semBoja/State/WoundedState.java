package recap_semBoja.State;


public class WoundedState implements MoveStateInterface{

	@Override
	public void moveAtDifferentLocation() {
		System.out.println("The hero is moving slowly");
	}

}